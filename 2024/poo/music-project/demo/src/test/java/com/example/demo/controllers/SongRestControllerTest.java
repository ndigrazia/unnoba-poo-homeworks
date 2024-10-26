package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.PlayList;
import com.example.demo.entities.Song;

@SpringBootTest
public class SongRestControllerTest {

    @Test 
	public void testGetPlaylistSongs() {
		// Set up mocks
		Song song1 = Song.builder().id(1).name("Song 1").build();
		Song song2 = Song.builder().id(2).name("Song 2").build();
		//PlayList playlist = new PlayList();
		PlayList playlist = PlayList.builder()
			.id(1).name("playlist-1").songs(Arrays.asList(song1, song2)).build();
		//playlist.setId(1);
		//playlist.setName("playlist-1");
		//playlist.setSongs(Arrays.asList(song1, song2));
		
		// Call method under test
		List<Song> songs = playlist.getSongs();
		
		// Assert number of songs
		assertEquals(2, songs.size());
		
		// Assert song details 
		assertEquals(1, songs.get(0).getId());
		assertEquals("Song 1", songs.get(0).getName());
	}
	
}
