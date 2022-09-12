package example.Controllers;
import example.Handlers.EventHandler;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("")
public class WebhookResource {

    @GET
    @Path("/prod/healthcheck")
    public Response Healthcheck(){
        return Response
                .status(Response.Status.OK)
                .build();
    }


    @Path("/endpoint")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response post(String jsonBody, @Context HttpHeaders httpHeaders) {

        EventHandler eventHandler = new EventHandler();
        return eventHandler.handler(jsonBody, httpHeaders);

    }
}
