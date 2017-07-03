package com.example.configuration;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by j.zvirbulis on 21-06-2017.
 */
@Configuration
@PropertySource("file:/etc/config/application.properties")
@Profile("openshift")
public class OpenshiftConfiguration {
    private static final Logger LOG = LoggerFactory.getLogger(OpenshiftConfiguration.class);

    @Value("${my.name}")
    private String myName;

    /**
     * PostConstruct to fix sonar "issue".
     */
    @PostConstruct
    public void postConstruct() {
        LOG.info("Openshift profile loaded..........................................." + myName);
    }
}
