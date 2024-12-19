package ru.gb.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greet() {
        return "Welcome to the Spring Boot Application!";
    }
}
