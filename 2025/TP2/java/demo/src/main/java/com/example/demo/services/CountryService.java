package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Country;
import com.example.demo.repositories.CountryRepository;

@Service
public class CountryService {

    @Autowired
	private CountryRepository countryRepository;

    public List<Country> retrieveAllCountries() {
		return countryRepository.findAll();
	}
	
	public Country getCountry(Integer id) {
	    return countryRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
	}
    
}
