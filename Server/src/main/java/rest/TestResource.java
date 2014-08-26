package rest;

import text.Messages;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/api")
public class TestResource {

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String simpleRestResponse() {
        return Messages.WORKING_API;
    }
}