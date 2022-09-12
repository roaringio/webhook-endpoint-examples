using System.Text.Json.Serialization;

namespace WebhookExample.Models.PayloadRequest.SE.SigningCombinations
{
    public class Position
    {
        [JsonPropertyName("roleCode")]
        public int RoleCode { get; set; }

        [JsonPropertyName("roleName")]
        public string RoleName { get; set; }
    }
}