package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
	private UserRepository userRepository;

    public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}
	
	public User getUser(Integer id) {
	    return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
	}
    
    public void addUser(User u) {
        userRepository.save(u);
    }
	
}
