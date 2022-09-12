using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;

namespace WebhookExample.Handlers
{
    public class Signature
    {
        public string RoaringSignature { get; set; }
        private string ClientSignature { get; set; }
        public string Payload { get; set; }

        private long _ts;
        private string _v1;
        
        public bool SignatureValidated()
        {
            return SignatureVerifier() && TimeStampValidated();
        }
        
        public void SignatureExtractor()
        {
            try
            {
                var splitByComma = RoaringSignature.Split(",");
                var splitByEquals = new List<string>();

                foreach (var e in splitByComma)
                {
                    var test = e.Split("=");
                    splitByEquals.AddRange(test);
                }
                _ts = long.Parse(splitByEquals[1]);
                _v1 = splitByEquals[3];
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                throw;
            }
            
            var signedPayload = Encoder($"{_ts}.{Payload}");
            
            // Implement signing secret retrieval of choice, do not hardcode as in this example
            var signingSecret = Encoder("signingSecret");
            
            
            /*
             * Compute an HMAC with the SHA256 hash function.
             * Use the endpoint’s signing secret as the key, and use the signed_payload string as the message.
             */
            ClientSignature = HmacCalculator(signingSecret, signedPayload);
        }
        
        
        private static string HmacCalculator(byte[] key, byte[] message)
        {
            var hasher = new HMACSHA256(key);
            var byteHashed = hasher.ComputeHash(message);
            var result = string.Join("", byteHashed.ToList().Select(b => b.ToString("X2")).ToArray()).ToLower();
            return result;
        }

        private static byte[] Encoder(string str)
        {
            var encodedStr = new UTF8Encoding();
            return encodedStr.GetBytes(str);
        }
        
        private bool SignatureVerifier()
        {
            return _v1 == ClientSignature;
        }

        private bool TimeStampValidated()
        { 
            /* Recommend using Network Time Protocol (NTP) to ensure that your server's clock
            * is accurate and synchronizes with the time on Roaring's servers.
            *
            * Compute the difference between the current timestamp and
            * the received timestamp, then decide if the difference is within your tolerance.
            */
            var currentTimeSec = Convert.ToInt64(GetCurrentMilli()/1000);
            var diff = currentTimeSec - _ts;
            const long fiveMinutesInSec = 300;
            var fiveAgo = currentTimeSec - fiveMinutesInSec;

            return diff <= fiveMinutesInSec && fiveAgo < _ts;
        }

        private static double GetCurrentMilli()
        {
            var jan1970 = new DateTime(1970, 1, 1, 0, 0, 0, DateTimeKind.Utc);
            var dateTime = DateTime.UtcNow - jan1970;
            return dateTime.TotalMilliseconds;
        }
    }
}