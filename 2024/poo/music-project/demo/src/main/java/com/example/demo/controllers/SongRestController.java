package com.example.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SongDto;

import com.example.demo.services.SongService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SongRestController {

    @Autowired
	private SongService songService;

	@Autowired
	private ModelMapper modelMapper;

    @GetMapping("/songs")	
	public ResponseEntity<List<SongDto>> retrieveAllSongs() {
		return new ResponseEntity<>(songService.retrieveAllSongs().stream().map(
				s->modelMapper.map(s, SongDto.class)).toList(), HttpStatus.OK);
	}
	
}
