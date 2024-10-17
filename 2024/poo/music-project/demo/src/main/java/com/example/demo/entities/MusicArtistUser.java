package com.example.demo.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Artist")
public class MusicArtistUser extends User {

    @Override
    public boolean canCreateSongs() {
       return true;
    }
    
}
