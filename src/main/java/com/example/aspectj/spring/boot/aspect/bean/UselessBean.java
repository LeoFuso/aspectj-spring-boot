package com.example.aspectj.spring.boot.aspect.bean;

public class UselessBean {

    private final String value;

    public UselessBean(final String property) {
        this.value = property;
    }

    public String doUselessBehavior() {
        return value;
    }
}
