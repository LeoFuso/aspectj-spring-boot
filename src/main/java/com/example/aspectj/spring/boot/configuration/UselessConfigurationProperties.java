package com.example.aspectj.spring.boot.configuration;

import javax.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties("useless.properties")
public class UselessConfigurationProperties {

    @NotBlank
    private String property = "value";

    public String getProperty() {
        return property;
    }

    public void setProperty(final String property) {
        this.property = property;
    }

}
