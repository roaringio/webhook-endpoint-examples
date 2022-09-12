using Microsoft.AspNetCore.Mvc;
using EventHandler = WebhookExample.Handlers.EventHandler;


namespace WebhookExample.Controllers
{
    [Route("/WebhookCs/[controller]")] //endpoint http://localhost:5000/webhook
    public class WebhookController : Controller
    {
        
        [HttpPost] 
        public IActionResult Post([FromBody] string body)
        {
            Request.Headers.TryGetValue("Roaring-Signature", out var roaringSignature);

            var eventHandler = new EventHandler();
            eventHandler.Handler(body, roaringSignature);
            return eventHandler.ResponseCodeHandler() switch
            {
                200 => Ok(),
                417 => StatusCode(417),
                _ => BadRequest("Signature doesn't match!")
            };
        }
        
    }
}
