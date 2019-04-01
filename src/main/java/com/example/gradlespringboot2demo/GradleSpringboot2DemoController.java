package com.example.gradlespringboot2demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleSpringboot2DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
