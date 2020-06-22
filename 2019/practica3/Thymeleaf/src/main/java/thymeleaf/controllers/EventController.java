package thymeleaf.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import thymeleaf.entities.Event;
import thymeleaf.entities.User;
import thymeleaf.repositories.EventRepository;

@Controller
public class EventController {
    
    private final EventRepository eventRepository;

    @Autowired
    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping("/events")
    public String index(Model model) {
    	Iterable<Event> events = eventRepository.findAll();
    	/*if(!events.iterator(). hasNext())
    		events = null;*/
    	model.addAttribute("events", events);
        return "events";
    }  
    
}
