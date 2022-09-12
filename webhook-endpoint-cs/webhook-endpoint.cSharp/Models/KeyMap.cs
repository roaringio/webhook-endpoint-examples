
using System.Text.Json.Serialization;


namespace WebhookExample.Models
{
    public class KeyMap
    {
        [JsonPropertyName("companyId")]
        public string CompanyId { get; set; }

        [JsonPropertyName("personId")]
        public int PersonId { get; set; }

        [JsonPropertyName("personalNumber")]
        public string PersonalNumber { get; set; }

        [JsonPropertyName("birthDate")]
        public string BirthDate { get; set; }

        [JsonPropertyName("firstName")]
        public string FirstName { get; set; }

        [JsonPropertyName("lastName")]
        public string LastName { get; set; }

        [JsonPropertyName("pepId")]
        public string PepId { get; set; }

        [JsonPropertyName("referenceNumber")]
        public string ReferenceNumber { get; set; }

    }
}