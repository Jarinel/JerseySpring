package ru.jarinel.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.jarinel.server.resource.SampleResource;

/**
 * Created by Jarinel on 05.12.2015.
 */

@Configuration
@ComponentScan(basePackageClasses = SampleResource.class)
public class SampleConfig {

    @Bean
    public String getString() {
        return "Finally, after all this years!";
    }
}
