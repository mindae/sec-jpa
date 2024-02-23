package com.mindae.secjpa.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String home() {
        return "home page";
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String user() {
        return "user page";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "admin page";
    }
}
