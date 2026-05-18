package com.vitamania.products.controller;

import com.vitamania.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/test-exception")
    public String testException() {

        log.info("Testing exception endpoint");

        throw new ResourceNotFoundException("Product not found");
    }
}