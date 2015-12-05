package ru.jarinel.interfaces.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Jarinel on 05.12.2015.
 */
public interface MainResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String common();

    @Path("/test")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String advanced();
}
