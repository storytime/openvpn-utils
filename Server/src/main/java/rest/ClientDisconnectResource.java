package rest;
/**
 * User: Bogdan
 */


import model.LoginData;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/client_disconnect")
public class ClientDisconnectResource {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(LoginData cld) {
        try {
            System.out.println("test");
            return Response.status(200).entity("ok").build();
        } catch (Exception e) {
            return Response.status(400).entity("fail").build();
        }

    }
}