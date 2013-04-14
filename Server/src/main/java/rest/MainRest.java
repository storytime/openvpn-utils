package rest;

/**
 * User: Bogdan
*/


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/rest/test")
public class MainRest {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String simpleRestResponse() {
        return "ok";
    }
}