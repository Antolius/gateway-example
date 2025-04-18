package com.att.training.gateway.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, %s!".formatted(name);
    }
}
