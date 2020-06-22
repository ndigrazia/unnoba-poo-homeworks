package ar.edu.unnoba.poo.practica4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ar.edu.unnoba.poo.practica4.entities.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select u from User u where u.username = :username")
	public User findUserByUsername(@Param("username") String username); 
	
}
