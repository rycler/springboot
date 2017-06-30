package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example" })
public class SwaggerCodeGenApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SwaggerCodeGenApplication.class);

    public static void main(String[] args) {
        LOG.info("Starting up microservice...........................................");
        SpringApplication.run(SwaggerCodeGenApplication.class, args);
    }
}
