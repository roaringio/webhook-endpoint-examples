using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace WebhookExample.Models.PayloadRequest.SE.SigningCombinations
{
    public class Combination
    {
        [JsonPropertyName("anomalies")]
        public List<Anomaly> Anomalies { get; set; }
        
        [JsonPropertyName("name")]
        public string Name { get; set; }
        
        [JsonPropertyName("personalNumber")]
        public string PersonNumber { get; set; }

        [JsonPropertyName("positions")]
        public List<Position> Positions { get; set; }
        
    }
}