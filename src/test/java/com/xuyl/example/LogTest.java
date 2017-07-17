package com.xuyl.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by dell on 2017/7/17.
 */
public class LogTest {

    private static Logger log= LogManager.getLogger(LogTest.class);

    @Test
    public void logtest(){
        log.info("test log");
    }

}
