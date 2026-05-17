package com.vitamania.products.controller;

import com.vitamania.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test-exception")
    public String testException() {

        throw new ResourceNotFoundException("Product not found");

    }
}