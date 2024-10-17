package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PlayList;
import com.example.demo.entities.Song;
import com.example.demo.entities.User;
import com.example.demo.services.PlayListService;
import com.example.demo.services.SongService;
import com.example.demo.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.ArrayList;

@RestController
public class PlayListRestController {

    @Autowired
	private PlayListService playlistService;

	@Autowired
	private SongService songService;

	@Autowired
	private UserService userService;

    @GetMapping("/playlist")	
	public PlayList makeAPlaylist() {
		List<Song> songs = new ArrayList<Song>();		
		songs.add(songService.getSong(1));
		songs.add(songService.getSong(2));

		User u = userService.getUser(1);

		PlayList p = playlistService.makeAPlaylist("playlist-1", u, songs);

		return p;
	}
	
}
