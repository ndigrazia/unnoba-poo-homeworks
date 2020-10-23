package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
	@Query("select u from User u where u.username = :username")
	public User findUserByUsername(@Param("username") String username); 
		
}
