package com.example.demo.services;

import com.example.demo.entities.Booking;

import org.springframework.stereotype.Service;

@Service
public class BookingService {
    
    public Booking reserveAdd(int room_id, String from, String to) {
        //TODO Implementar con JPA
        Booking reserve = new Booking();

		reserve.setId(1);
		
        return reserve;
    }
    
}
