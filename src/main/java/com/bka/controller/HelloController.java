package com.bka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")  // Исправьте на /hello (было /hellooo)
    public String sayHello() {
        return "hello"; // Будет искать /WEB-INF/views/hello.html
    }
}