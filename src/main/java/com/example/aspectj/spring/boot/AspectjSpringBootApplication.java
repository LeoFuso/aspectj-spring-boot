package com.example.aspectj.spring.boot;

import org.aspectj.lang.Aspects;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.aspectj.spring.boot.aspect.JavaSyntax;
import com.example.aspectj.spring.boot.aspect.bean.UselessBean;
import com.example.aspectj.spring.boot.model.Child;

@SpringBootApplication
public class AspectjSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AspectjSpringBootApplication.class, args);
    }

    @Bean
    public UselessBean uselessBean() {
        return new UselessBean();
    }

    @Bean
    public JavaSyntax aspect() {
        return Aspects.aspectOf(JavaSyntax.class);
    }
}
