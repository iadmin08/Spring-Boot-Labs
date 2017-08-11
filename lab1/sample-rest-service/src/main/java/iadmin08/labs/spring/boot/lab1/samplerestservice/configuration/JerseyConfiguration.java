package iadmin08.labs.spring.boot.lab1.samplerestservice.configuration;

import iadmin08.labs.spring.boot.lab1.samplerestservice.endpoint.MyResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        register(MyResource.class);
     }
}

