package com.example.demo.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Enthusiast")
public class MusicEnthusiastUser extends User {

    @Override
    public boolean canCreateSongs() {
       return false;
    }
    
}
