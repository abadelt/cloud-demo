package it.badelt.demo.clouddemo;

import it.badelt.demo.clouddemo.controller.HelloController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Configuration
public class RestConfig extends ResourceConfig {

    public RestConfig() {
        register(HelloController. class);
    }
}