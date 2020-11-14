package com.example.demo.entities;

public class Room {
    
    private int id;
    private String name;

    protected int version;
    
    public Room() {
    }

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    
}
