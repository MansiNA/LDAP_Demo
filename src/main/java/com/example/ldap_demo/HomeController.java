package com.example.ldap_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ldap")
public class HomeController {

    @GetMapping("/security")
    public String index() {
        return "Welcome to the home page!";
    }

}