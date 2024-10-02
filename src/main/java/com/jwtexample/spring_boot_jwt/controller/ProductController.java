package com.jwtexample.spring_boot_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public String getProduct(){
        return "Welcome to the Spring JWT session.";
    }
}
