package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Song;
import com.example.demo.services.SongService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SongRestController {

    @Autowired
	private SongService songService;

    @GetMapping("/songs")	
	public List<Song> retrieveAllCountries() {
		return songService.retrieveAllSongs();
	}
	
}
