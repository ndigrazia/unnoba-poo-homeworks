package ar.edu.unnoba.poo.practica4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/","/home"})
	public String index() {
		return "home";
	}
	
	@GetMapping("/hello")
	public String menu() {
		return "hello";
	}
	
	@GetMapping("/login")
	public String user() {
		return "login";
	}

}
