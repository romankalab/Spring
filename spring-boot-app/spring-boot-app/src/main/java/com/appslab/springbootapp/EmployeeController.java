package com.appslab.springbootapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class EmployeeController {
    @RequestMapping("/hello")
    String hello() {
        return "Hello Spring Boot.";
    }
}
