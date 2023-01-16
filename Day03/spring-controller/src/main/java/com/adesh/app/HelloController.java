package com.adesh.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/hello")

    public String SayHello(){
        return "Hello from app";
    }

//    Another way to create controller

    @RequestMapping("/request/hello")
    public String requestHello(){
        return "Hello from Request mapping";
    }
}
