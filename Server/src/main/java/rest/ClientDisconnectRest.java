package rest;
/**
 * User: Bogdan
 */


import entity.ClientDisconnect;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest/*")
public class ClientDisconnectRest {


    @POST
    @Path("/client")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(ClientDisconnect cld) {
        try {
            String result = "Track saved : ";
            System.out.println("111");
            return Response.status(200).entity("ok").build();
        } catch (Exception e) {
            System.out.println("fail json");

        }
        return Response.status(200).entity("ok").build();
    }


//    @GET
//    @Path("/get")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Track getTrackInJSON() {
//        Track track = new Track();
//        return track;
//    }
//
//    @POST
//    @Path("/post")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response createTrackInJSON(Track track) {
//        try {
//            String result = "Track saved : " + track;
//            System.out.println("111");
//            return Response.status(200).entity("ok").build();
//        } catch (Exception e) {
//            System.out.println("fail json");
//
//        }
//        return Response.status(201).entity("ok").build();
//    }
}