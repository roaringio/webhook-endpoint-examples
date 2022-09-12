using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace WebhookExample.Models
{
    public class Event<T>
    {
        [JsonPropertyName("changeType")]
        public string ChangeType { get; set; }

        [JsonPropertyName("countryCodes")]
        public List<string> CountryCodes { get; set; }

        [JsonPropertyName("keyMap")]
        public KeyMap KeyMap { get; set; }

        [JsonPropertyName("newAttributes")]
        public object NewAttributes { get; set; }

        [JsonPropertyName("previousAttributes")]
        public object PreviousAttributes { get; set; }

        [JsonPropertyName("messageId")]
        public string MessageId { get; set; }

        [JsonPropertyName("object")]
        public dynamic Object { get; set; }

        [JsonPropertyName("requestType")]
        public string RequestType { get; set; }

        [JsonPropertyName("timestamp")]
        public int Timestamp { get; set; }

        [JsonPropertyName("type")]
        public string Type { get; set; }

        [JsonPropertyName("version")]
        public string Version { get; set; }
    }
}
