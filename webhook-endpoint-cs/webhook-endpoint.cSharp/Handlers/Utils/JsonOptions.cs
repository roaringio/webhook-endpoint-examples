using System.Text.Json;

namespace WebhookExample.Handlers.Utils
{
    public static class JsonOptions
    {
        public static JsonSerializerOptions GetOptions()
        {
            var options = new JsonSerializerOptions
            {
                PropertyNameCaseInsensitive = true,
                
            };
            return options;
        }
    }
}