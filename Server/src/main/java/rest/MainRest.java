package rest;

/**
 * User: Bogdan
 */


import utils.text.RestResources;
import utils.text.RestResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path(RestResources.TEST)
public class MainRest {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String simpleRestResponse() {
        return RestResponse.OK;
    }
}