package com.example.Devops_Project;

import org.springframework.web.bind.annotation.*;
@RestController
public class HelloService {
    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}