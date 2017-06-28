package com.accenture.openbanking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.accenture.openbanking"})
public class SwaggerCodeGenApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SwaggerCodeGenApplication.class);

    /** Main Class
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        LOG.info("Starting up microservice...........................................");
        SpringApplication.run(SwaggerCodeGenApplication.class, args);
    }
}
