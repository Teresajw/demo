package com.teresaj.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeresajController {
    @GetMapping("/hello")
    public String test() {
        return "Hello Docker 2021.8.6！！！";
    }
}
