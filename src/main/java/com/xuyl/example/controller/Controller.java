package com.xuyl.example.controller;

import com.xuyl.example.service.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Created by dell on 2017/7/13.
 */
@Path("/api")
public class Controller {

    private static final Logger logger = LogManager.getLogger(Controller.class);
    private Service service = new Service();

    @GET
    @Produces("application/json")
    @Path("hello/{id}")
    public void get(@PathParam("id") String id) {
        logger.info("hello", id);
        String result = "hello:" + id;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getAllService")
    public Response getAllService() {
        logger.info("getAllService start ===>");
        String json = service.getAllService();
        return Response.status(200).entity(json).build();
    }
}
