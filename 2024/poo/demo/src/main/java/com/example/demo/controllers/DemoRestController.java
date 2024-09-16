package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    
    @RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
