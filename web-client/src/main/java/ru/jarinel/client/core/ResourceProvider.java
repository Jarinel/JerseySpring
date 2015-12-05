package ru.jarinel.client.core;

import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.springframework.stereotype.Component;
import ru.jarinel.interfaces.rest.MainResource;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Created by Jarinel on 06.12.2015.
 */

@Component
public class ResourceProvider {
    private static final String target = "http://localhost:8080/server/";

    private Client client;
    private MainResource mainResource;

    @PostConstruct
    private void init() {
        client = ClientBuilder.newClient();

        mainResource = WebResourceFactory.newResource(MainResource.class, client.target(target).path("/"));
    }

    public MainResource getMainResource() {
        return mainResource;
    }
}
