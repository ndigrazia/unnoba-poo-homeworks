package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Country;
import com.example.demo.services.CountryService;

@RestController
public class CountryRestController {
    
    @Autowired
	private CountryService countryService;

    @GetMapping("/countries")	
	public List<Country> retrieveAllCountries() {
		return countryService.retrieveAllCountries();
	}
	
	@GetMapping("/countries/{id}")
	public Country getCountry(@PathVariable Integer id) {
	    return countryService.getCountry(id);
	}
}
