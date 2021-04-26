package com.javaian.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userservicefallback")
    public String fallBackuser() {
        return "User Service is waiting longer than expected!!!";
    }

    @GetMapping("/departmentservicefallback")
    public String fallBackdepartment() {
        return "Department Service is waiting longer than expected!!!";
    }
}
