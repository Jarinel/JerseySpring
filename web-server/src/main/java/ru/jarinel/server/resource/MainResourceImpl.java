package ru.jarinel.server.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.jarinel.interfaces.rest.MainResource;

import javax.ws.rs.Path;

/**
 * Created by Jarinel on 05.12.2015.
 */
@Path("/")
@Component
public class MainResourceImpl implements MainResource {

    @Autowired
    private String value;

    @Override
    public String common() {
        return "Some kind of a common string";
    }

    @Override
    public String advanced() {
        return value;
    }
}
