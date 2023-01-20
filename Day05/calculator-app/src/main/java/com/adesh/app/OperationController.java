package com.adesh.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class OperationController {
    @GetMapping("/add")
    public long add(@RequestParam("a") long a, @RequestParam("b") long b){
        return a+b;
    }

    @PostMapping("/sub")
    public long sub(@RequestParam("a") long a, @RequestParam("b") long b){
        return a-b;
    }

    @PutMapping("/mul")
    public long mul(@RequestParam("a") long a, @RequestParam("b") long b){
        return a*b;
    }
}
