package com.example.pmyfirstweb.services;

import java.util.List;

import com.example.pmyfirstweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

import javax.persistence.EntityManager;

import com.example.pmyfirstweb.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;


	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}
	
	public void addUser(User user) {
	    userRepository.save(user);
	}
	
	public User getUser(Long id) {
	    return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
	}
	
	public User replaceUser(User user, Long id) {
	    return userRepository.findById(id)
	      .map(u -> {
	        u.setEmail(user.getEmail());
	        u.setPassword(user.getPassword());
	        u.setFirstName(user.getFirstName());
	        u.setLastName(user.getLastName());
	        return userRepository.save(u);
	      })
	      .orElseGet(() -> {
	        return userRepository.save(user);
	      });
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public User findUserByUsername(String username) {
		return userRepository.findUserByUsername(username);
	}
	
}
