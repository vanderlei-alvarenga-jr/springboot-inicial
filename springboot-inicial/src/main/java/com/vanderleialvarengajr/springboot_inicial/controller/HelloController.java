package com.vanderleialvarengajr.springboot_inicial.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/")
    public String getMethodName() {
        return new String("Olá mundo VsCode!");
    }
    
}
