package com.vitamania.products.controller;

import com.vitamania.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @GetMapping("/admin/test")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminEndpoint() {

        return "Admin endpoint accessed";

    }

    @GetMapping("/customer/test")
    @PreAuthorize("hasRole('CUSTOMER')")
    public String customerEndpoint() {

        return "Customer endpoint accessed";

    }
}