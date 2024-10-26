package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Song>> retrieveAllSongs() {
		return new ResponseEntity<>(songService.retrieveAllSongs(), HttpStatus.OK);
	}
	
}
