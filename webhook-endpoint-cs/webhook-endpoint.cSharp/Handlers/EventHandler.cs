using JsonSerializer = System.Text.Json.JsonSerializer;
using System.Threading;
using WebhookExample.Models;
using WebhookExample.Processing;
using JsonOptions = WebhookExample.Handlers.Utils.JsonOptions;

namespace WebhookExample.Handlers
{
    public class EventHandler
    {
        private const int Ok = 200;
        private const int ExceptionFailed = 417;
        private const int BadRequest = 400;

        private readonly Signature _signature = new Signature();
        private Event<dynamic> _event;

        public void Handler(string body, string roaringSignature)
        {
            
            _signature.Payload = body.Replace("\n", "").Replace("\r", "");
            _signature.RoaringSignature = roaringSignature;
            
            // Parsing the JSON string body into an Event object
            _event = JsonSerializer.Deserialize<Event<dynamic>>(_signature.Payload, JsonOptions.GetOptions());
            _signature.SignatureExtractor();

        }
        
        public int ResponseCodeHandler()
        {
            if (!_signature.SignatureValidated()) return BadRequest;
            return MessageHandler() ? Ok : ExceptionFailed;
        }

        private bool MessageHandler()
        {
            switch (_event.RequestType)
            {
                case "continue":
                    return ContinueHandler(_event.Type, _event.KeyMap);

                case "payload":
                    /* Handle payload in running thread so that httpResponse does not wait for payload processing. */
                     var pp = new PostProcessing(_event);
                     var t = new Thread(pp.Run);
                     t.Start();
                    return true; // Http status code 200 (OK).
                
                default:
                    return false;
            }
        }
        private static bool ContinueHandler(string type, KeyMap keyMap)
        {
            /*
             * Check the received notification's identifier against your database and decide whether
             * you want the payload event information connected to the notification sent to your webhook url or not.
             *
             * Use type and use existing get-function from KeyMap class to verify that the event is relevant
             * Example: if(type == "companyInformationSe") String companyId = keyMap.CompanyId;
             * 
             * If you have no interest in the notification payload then
             * return false it will set the HTTP status code to 417.
             *
             * To accept the notification simply return true. Http status code is set to 200 (Ok).
             * To deny the notification simply return false. Http status code is set to 417. (Expectation Failed)
             */
            return true; 
        }

    }
    
}