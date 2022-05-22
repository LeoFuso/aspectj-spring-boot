package com.example.aspectj.spring.boot.model;

public class Child extends Parent {

    public Child(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}