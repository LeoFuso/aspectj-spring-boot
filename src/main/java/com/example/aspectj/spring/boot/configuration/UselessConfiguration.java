package com.example.aspectj.spring.boot.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.aspectj.spring.boot.aspect.bean.UselessBean;

@Configuration
@EnableConfigurationProperties(UselessConfigurationProperties.class)
public class UselessConfiguration {

    private final UselessConfigurationProperties properties;

    public UselessConfiguration(final UselessConfigurationProperties properties) {this.properties = properties;}


    @Bean
    public UselessBean uselessBean() {
        return new UselessBean(properties.getProperty());
    }


}
