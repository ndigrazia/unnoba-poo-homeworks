package ar.edu.unnoba.poo.practica4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ar.edu.unnoba.poo.practica4.entities.Event;
import ar.edu.unnoba.poo.practica4.entities.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	@Query("select e from Event e where e.owner = :owner")
	public List<Event> findAllEventByOwner(@Param("owner") User user); 
	
}
