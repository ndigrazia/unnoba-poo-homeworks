package ar.edu.unnoba.poo.practica4.services;

import java.util.List;

import ar.edu.unnoba.poo.practica4.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unnoba.poo.practica4.entities.Event;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private UserService userService;
	
	public List<Event> findAllEventByOwnerID(Long userID){
		return eventRepository.findAllEventByOwner(userService.getUser(userID));
	}

	public void addEvent(Event event) {
		eventRepository.save(event);
	}
}
