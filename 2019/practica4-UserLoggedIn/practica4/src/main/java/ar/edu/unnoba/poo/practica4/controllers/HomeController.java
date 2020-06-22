package ar.edu.unnoba.poo.practica4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.userdetails.UserDetails;
import ar.edu.unnoba.poo.practica4.userDetails.UserLoggedIn;

@Controller
public class HomeController {

	@GetMapping({"/","/home"})
	public String index() {
		return "home";
	}
	
	@GetMapping("/hello")
	public String menu(@AuthenticationPrincipal UserLoggedIn user) {
		System.out.println("--------------------->>>> " + user.getUsername());
		System.out.println("--------------------->>>> " + user.getUser().getId());
		return "hello";
	}
	
	@GetMapping("/login")
	public String user() {
		return "login";
	}

}
