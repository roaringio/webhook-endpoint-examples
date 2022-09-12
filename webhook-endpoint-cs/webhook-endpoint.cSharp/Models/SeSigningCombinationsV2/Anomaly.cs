using System.Text.Json.Serialization;

namespace WebhookExample.Models.PayloadRequest.SE.SigningCombinations
{
    public class Anomaly
    {
        [JsonPropertyName("anomalyCode")]
        public int AnomalyCode { get; set; }

        [JsonPropertyName("anomalyDescription")]
        public string AnomalyDescription { get; set; }
    }
}