package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Room;

import org.springframework.stereotype.Service;

@Service
public class RoomService {
    
    public List<Room> roomsAvailabilities(String from, String to, String sleeps) {
        //TODO Implementar con JPA
        List<Room> availabilities = new ArrayList<Room>();
       
        availabilities.add(new Room(1, "Root 1"));
        availabilities.add(new Room(1, "Root 2"));
        
        return availabilities;
    }

    public Room roomDetails(int id) {
        //TODO Implementar con JPA
        Room room = new Room(1, "Root 1");
        return room;
    }
    
}
