package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Song;
import com.example.demo.repositories.SongRepository;

@Service
public class SongService {

    @Autowired
	private SongRepository SongRepository;

    public List<Song> retrieveAllSongs() {
		return SongRepository.findAll();
	}
	
	public Song getSong(Integer id) {
	    return SongRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
	}
    
    public void addCountry(Song s) {
        SongRepository.save(s);
    }
	
}
