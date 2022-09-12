package example.Controllers;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class ApiApplication extends Application {

    private static WebhookResource webhookResource;

    @Override
    public Set<Object> getSingletons() {
        if (webhookResource == null) {
            webhookResource = new WebhookResource();
        }
        return Collections.singleton(webhookResource);
    }
}
