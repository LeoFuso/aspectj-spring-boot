package com.example.aspectj.spring.boot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("useless.properties")
public class UselessConfigurationProperties {

    private String property = "value";

    public String getProperty() {
        return property;
    }

    public void setProperty(final String property) {
        this.property = property;
    }

}
