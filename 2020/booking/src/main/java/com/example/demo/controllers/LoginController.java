package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/")
    public String viewHome() {
    	return "index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam String user, @RequestParam String password, Model model) {
    	return "bookings";
	}
	
}
