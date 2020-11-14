package com.example.demo.controllers;

import com.example.demo.entities.Booking;
import com.example.demo.entities.Room;
import com.example.demo.services.BookingService;
import com.example.demo.services.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookingController {

	@Autowired
	private RoomService roomsService;

	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(value="/roomsAvailabilities", method=RequestMethod.POST)
	public String roomsAvailabilities(@RequestParam String from, 
						@RequestParam String to, @RequestParam String sleeps, Model model) {
	
		model.addAttribute("availabilities", roomsService.roomsAvailabilities(from, to, sleeps));
	
	   	return "bookings";
	}
	
	@RequestMapping(value="/rooms/{id}", method=RequestMethod.GET)	
	public String roomDetails(@PathVariable int id, Model model) {
		Room room = roomsService.roomDetails(id);
		
		model.addAttribute("room", room);
	
		return "booking-detail";
	}	
	
	@RequestMapping(value="/rooms/{id}/bookings", method=RequestMethod.POST)	
	public String reserveAdd(@PathVariable int id, @RequestParam String from, @RequestParam String to, Model model) {
		Booking reserve = bookingService.reserveAdd(id, from, to);
	
		model.addAttribute("reserve", reserve);

		return "reserve-detail";
	}

}
