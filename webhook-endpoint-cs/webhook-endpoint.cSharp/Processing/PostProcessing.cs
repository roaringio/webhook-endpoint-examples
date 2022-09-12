using System;
using System.Linq;
using JsonSerializer = System.Text.Json.JsonSerializer;
using WebhookExample.Handlers.Utils;
using WebhookExample.Models;
using WebhookExample.Models.PayloadRequest.SE.OverviewCompany;
using WebhookExample.Models.PayloadRequest.SE.SigningCombinations;

namespace WebhookExample.Processing
{
    public class PostProcessing {
         private readonly Event<dynamic> _event;

         public PostProcessing(Event<dynamic> @event)
         {
             _event = @event;
         }
         
         public void Run()
         {
             // Implement handling of data
             
             /* Example one: Cast json event object to relevant class
              * ChangeToRelevantClassName className = JsonSerializer.Deserialize<ChangeToRelevantClassName>(_event.Object.ToString(), JsonOptions.GetOptions());
              */
             
             //Example multi webhooks: Cast json event object to relevant class in switch statement
             var type = _event.Type;
             if (type != null)
             {
                 switch (_event.Type)
                 {
                     case "overviewCompanySe":
                     {
                         OverviewCompanySe overviewCompanySe = JsonSerializer.Deserialize<OverviewCompanySe>(_event.Object.ToString(), JsonOptions.GetOptions());
                         break;
                     }
                     case "signingCombinationsSe":
                     {
                         SigningCombinationSe signingCombinationSe = JsonSerializer.Deserialize<SigningCombinationSe>(_event.Object.ToString(), JsonOptions.GetOptions());
                         foreach (var position in signingCombinationSe.Combinations.SelectMany(combinations => combinations.SelectMany(combination => combination.Positions)))
                         {
                             Console.WriteLine(position.RoleName);
                         }
                         break;
                     }
                 }
             }

         } 
         
         
         private bool IdenpotentCheck()
         {
             /* Webhook endpoints might occasionally receive the same event more than once.
             * Recommend you to guard against duplicated event receipts by making your event processing idempotent.
             * One way of doing this is logging the events you’ve processed, and then not processing already-logged events.
             */
             return true;
         }
         
     }
    
}