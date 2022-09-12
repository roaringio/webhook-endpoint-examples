using Microsoft.AspNetCore.Mvc;

namespace WebhookExample.Controllers
{
    [Route("WebhookCs/prod/[controller]")]
    public class HealthCheck : Controller
    {
        [HttpGet]
        public IActionResult Index()
        {
            return Ok("Health check: OK");
        }
    }
}