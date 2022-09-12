using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace WebhookExample.Models.PayloadRequest.SE.SigningCombinations
{
    public class SigningCombinationSe
    {
        [JsonPropertyName("adminSign")]
        public List<AdminSign> AdminSign { get; set; }

        [JsonPropertyName("changeDate")]
        public string ChangeDate { get; set; }

        [JsonPropertyName("combinations")]
        public List<List<SigningCombinations.Combination>> Combinations { get; set; }

        [JsonPropertyName("companyId")]
        public string CompanyId { get; set; }

        [JsonPropertyName("coverage")]
        public string Coverage { get; set; }
    }
}