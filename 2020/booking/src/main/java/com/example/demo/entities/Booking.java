package com.example.demo.entities;

import java.sql.Date;

public class Booking {
    
    private int id;
    private Date fromDate; 
    private Date toDate; 
    private Room room;
    
    protected int version;
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
}
