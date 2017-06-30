package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example" })
@EnableAutoConfiguration
public class SwaggerCodeGenApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SwaggerCodeGenApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SwaggerCodeGenApplication.class, args);
    }
}
