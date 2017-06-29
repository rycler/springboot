package com.accenture.openbanking;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by j.zvirbulis on 21-06-2017.
 */
@Configuration
@PropertySource("file:/etc/ob-us-aisp/application-openshift.properties")
@Profile("openshift")
public class OpenshiftConfiguration {
}
