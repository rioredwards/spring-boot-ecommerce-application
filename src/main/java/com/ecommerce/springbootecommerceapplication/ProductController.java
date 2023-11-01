package com.ecommerce.springbootecommerceapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProductController {

    private static final String template = "Hello, %s!";

    @GetMapping("/")
    public Product product() {
        return new Product();
    }
}