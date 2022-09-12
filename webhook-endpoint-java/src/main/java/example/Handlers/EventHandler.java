package example.Handlers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import example.Models.RootEvent.Event;
import example.Models.RootEvent.KeyMap;
import example.Processing.PostProcessing;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.util.stream.Collectors;

public class EventHandler {


    public Response handler(String jsonBody, HttpHeaders httpHeaders){

        String payload = jsonBody.lines().collect(Collectors.joining());
        String SIGNATURE = "Roaring-Signature";
        String roaringSignature = String.valueOf(httpHeaders.getRequestHeaders().get(SIGNATURE));

        // Parsing the JSON string body into an Event object
        Event event = new Gson().fromJson(payload, Event.class);

        return getResponse(roaringSignature, payload, event);
    }


    private Response getResponse(String roaringSignature, String payload, Event event){
        SignatureHandler signatureHandler = new SignatureHandler();
        if(signatureHandler.signatureValidate(roaringSignature, payload)){
            if(requestTypeHandler(event, payload)){
                return Response
                        .status(200, "Accept request")
                        .build();
            }else {
                return Response
                        .status(417, "Decline request.")
                        .build();
            }
        }else{
            return Response
                    .status(400, "Invalid Signature.")
                    .build();
        }
    }


    private boolean requestTypeHandler(Event event, String payload){

        if(event.getRequestType().equals("continue")){

            System.out.println("Continue request received");
            return handleContinue(event.getType(), event.getKeyMap());

        }else if(event.getRequestType().equals("payload")){
            // Handle payload in running thread so that httpResponse does not wait for payload processing
            PostProcessing pp = new PostProcessing(event, payload);
            Thread t = new Thread(pp);
            t.start();
            System.out.println("Payload request received");
            return true; // Http status code 200 (OK).
        }
        else {
            return false;
        }
    }


    private boolean handleContinue(String type, KeyMap keyMap){
        /*
         * Check the received notification's identifier against your database and decide whether
         * you want the payload event information connected to the notification sent to your webhook url or not.
         *
         * Use type and use existing get-function from KeyMap class to verify that the event is relevant
         * Example: if(type == "companyInformationSe") String companyId = keyMap.CompanyId;
         *
         * If you have no interest in the notification payload then
         * return false it will set the HTTP status code to 417.
         *
         * To accept the notification simply return true. Http status code is set to 200 (Ok).
         */
        return true;
    }

    public String getObjectFromPayload(String json){
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        return String.valueOf(jsonObject.get("object"));
    }

}
