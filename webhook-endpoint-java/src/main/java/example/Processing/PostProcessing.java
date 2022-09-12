package example.Processing;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import example.Models.RootEvent.Event;
import example.Models.generated.SE.OverviewCompany.version_2.OverviewCompanySe;
import example.Models.generated.SE.SigningCombinations.version_2.SigningCombinationsSe;

public class PostProcessing implements Runnable{
    private Event event;
    private final String payload;

    public PostProcessing(Event event, String payload){
        this.event = event;
        this.payload = payload;
    }

    @Override
    public void run() {

        /* Implement handling of data */

        /*
         * One example of handling data:
         * Parse payload to a JsonObject and get StringMember "object".
         * Parse that string to relevant class.
         *
         * For an alternative way of processing the data make Event.class to a generic.
         * Class attribute should have generic as type and then u can use the following example:
         * event = new Gson().fromJson(payload, new TypeToken<Event<ChangeToRelevantClassName>>() {}.getType());
         * ChangeToRelevantClassName className = (ChangeToRelevantClassName) event.getObject();
         *
         */

        //Example multi webhooks: Cast event object to relevant class in switch statement
        JsonObject json = new JsonParser().parse(payload).getAsJsonObject();
        String eventObject = String.valueOf(json.get("object"));

        String type = event.getType();
        if(type != null ){
            switch (type)
            {
                case "overviewCompanySe" -> {
                    OverviewCompanySe overviewCompanySe = new Gson()
                            .fromJson(eventObject, OverviewCompanySe.class);
                    System.out.println(overviewCompanySe.getAddress());
                }

                case "signingCombinationsSe" -> {
                    SigningCombinationsSe signingCombinationsSe = new Gson()
                            .fromJson(eventObject, SigningCombinationsSe.class);
                    System.out.println(signingCombinationsSe
                            .getCombinations().iterator().next().iterator().next().getName());
                }

            }
        }

    }


    public boolean idempotentCheck(){
        /* Webhook endpoints might occasionally receive the same event more than once.
         * Recommend you to guard against duplicated event receipts by making your event processing idempotent.
         * One way of doing this is logging the events you’ve processed, and then not processing already-logged events.
         */
        return true;
    }
}
