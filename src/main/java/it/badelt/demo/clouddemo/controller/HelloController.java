package it.badelt.demo.clouddemo.controller;

import org.springframework.http.ResponseEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloController {

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public ResponseEntity<String> getDefaultHello() {
        return ResponseEntity.ok("Hello, earthling!");
    }

    @GET
    @Path("/{name}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public ResponseEntity<String> getHello(@PathParam("name") String name) {
        return ResponseEntity.ok("Hello, " + name + "!");
    }

}
