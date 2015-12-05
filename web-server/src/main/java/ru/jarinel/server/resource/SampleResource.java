package ru.jarinel.server.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Jarinel on 05.12.2015.
 */

@Path("sample")
@Component
public class SampleResource {

    @Autowired
    private String value;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return value;
    }
}
