package de.jsie.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import de.jsie.core.GreetingService;

@Path("/")
public class HelloWorldResource {

    private final GreetingService greetingService;

    public HelloWorldResource(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GET
    public Response createConfiguration() {
        return Response.ok(greetingService.greeting()).build();
    }
}
