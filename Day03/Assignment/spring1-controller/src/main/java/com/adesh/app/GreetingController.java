package com.adesh.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
    @GetMapping("/greet")

    public String SayGreet() {
        return "greet from app";
    }

    @GetMapping("/welcome")

    public String SayWelcome() {
        return "welcome from app";
    }

    @GetMapping("/hi")

    public String SayHi() {
        return "hi from app";
    }

    @GetMapping("/thanks")

    public String SayThanks() {
        return "thanks from app";
    }

//    Another way to create controller

    @RequestMapping("/request/greet")
    public String requestGreet() {
        return "greet from Request Mapping";
    }

    @RequestMapping("/request/welcome")
    public String requestWelcome() {
        return "greet from Request Mapping";
    }
    @RequestMapping("/request/hi")
    public String requestHi() {
        return "hi from Request Mapping";
    }
    @RequestMapping("/request/thanks")
    public String requestThanks() {
        return "thanks from Request Mapping";
    }
}