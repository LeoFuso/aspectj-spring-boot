package com.example.aspectj.spring.boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aspectj.spring.boot.model.Child;
import com.example.aspectj.spring.boot.model.Parent;

@RestController
@RequestMapping
public class MainController {

    @GetMapping(path = {"children"})
    public ResponseEntity<String> getChildrenName() {
        final Child child = new Child("Robert");
        return ResponseEntity.ok(child.getName());
    }

    @GetMapping(path = {"parent"})
    public ResponseEntity<String> getParentName() {
        final Parent parent = new Parent();
        return ResponseEntity.ok(parent.getName());
    }
}
