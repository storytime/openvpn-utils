package rest;
/**
 * User: Bogdan
 */


import entity.ClientDisconnectEntity;
import service.ClientDisconnectService;
import utils.text.RestResources;
import utils.text.RestResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(RestResources.MAIN_REST_PATH)
public class ClientDisconnectRest {


    @POST
    @Path(RestResources.CLIENT_DISCONNECT)
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(ClientDisconnectEntity cld) {
        try {
            System.out.println(cld.getCommonName());
            ClientDisconnectService.save(cld);
            return Response.status(200).entity(RestResponse.OK).build();
        } catch (Exception e) {
            return Response.status(400).entity(RestResponse.ERROR).build();
        }

    }
}