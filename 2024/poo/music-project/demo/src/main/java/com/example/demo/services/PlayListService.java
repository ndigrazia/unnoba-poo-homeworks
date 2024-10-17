package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.PlayList;
import com.example.demo.entities.Song;
import com.example.demo.entities.User;
import com.example.demo.repositories.PlayListRepository;

import java.util.List;

@Service
public class PlayListService {

    @Autowired
	private PlayListRepository playListRepository;

   	public PlayList makeAPlaylist(String name, User u, List<Song> songs) {
		PlayList p = new PlayList();
		
		p.setOwner(u);
		p.setName(name);
		p.getSongs().addAll(songs);

		p = playListRepository.save(p);
		
		return p;
	}
    
	
}
