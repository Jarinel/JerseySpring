package ru.jarinel.server.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import ru.jarinel.server.config.SampleConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.ws.rs.ApplicationPath;

/**
 * Created by Jarinel on 05.12.2015.
 */

@Order(Ordered.HIGHEST_PRECEDENCE)
@ApplicationPath("/")
public class JerseyApplication extends ResourceConfig implements WebApplicationInitializer {

    public JerseyApplication() {
        packages("ru.jarinel.resource");
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter(ContextLoader.CONFIG_LOCATION_PARAM, SampleConfig.class.getPackage().getName());
        servletContext.setInitParameter(ContextLoader.CONTEXT_CLASS_PARAM, AnnotationConfigWebApplicationContext.class.getName());

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("ru.jarinel.config");
        context.setServletContext(servletContext);

        servletContext.addListener(new ContextLoaderListener(context));
        property("contextConfig", context);
    }
}
