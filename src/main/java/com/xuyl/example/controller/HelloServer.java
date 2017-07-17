package com.xuyl.example.controller;

import com.xuyl.example.main.NettyContainer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.spi.Registry;

/**
 * Created by dell on 2017/7/13.
 */
public class HelloServer{
    private static final Logger logger = LogManager.getLogger(HelloServer.class);

    public static void main(String[] args) throws Exception {
        Registry registry = NettyContainer.start().getRegistry();
        registry.addPerRequestResource(Controller.class);
        logger.info("Server started");
    }
}
