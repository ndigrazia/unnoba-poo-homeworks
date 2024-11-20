package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.dto.PlayListDto;
import com.example.demo.entities.MusicArtistUser;
import com.example.demo.entities.PlayList;
import com.example.demo.entities.Song;
import com.example.demo.entities.User;
import com.example.demo.services.PlayListService;
import com.example.demo.services.SongService;
import com.example.demo.services.UserService;

@SpringBootTest
public class PlayListRestControllerTest {

    @Test
	public void testMakePlaylist() {
		// Set up mock song, user and playlist services
		SongService songServiceMock = mock(SongService.class);
		UserService userServiceMock = mock(UserService.class);
		PlayListService playlistServiceMock = mock(PlayListService.class);
		
		// Set up mock data
		Song song1 = Song.builder().id(1).name("Song 1").build();
		Song song2 = Song.builder().id(2).name("Song 2").build();
		when(songServiceMock.getSong(1)).thenReturn(song1);
		when(songServiceMock.getSong(2)).thenReturn(song2);
		
		MusicArtistUser user = new MusicArtistUser();
		user.setId(1);
		user.setUsername("John");
		when(userServiceMock.getUser(1)).thenReturn(user);
		
		PlayList playlist = new PlayList();
		playlist.setId(1);
		playlist.setName("playlist-1");
		playlist.setOwner(user);
		playlist.setSongs(Arrays.asList(song1, song2));
		
		when(playlistServiceMock.makeAPlaylist(anyString(), any(User.class), anyList())).thenReturn(playlist);

		ModelMapper mapper = new ModelMapper();

		PlayListDto dto = mapper.map(playlist, PlayListDto.class);
		
		// Set up system under test
		PlayListRestController controller = new PlayListRestController();
		controller.playlistService = playlistServiceMock;
		controller.songService = songServiceMock;
		controller.userService = userServiceMock;
		controller.modelMapper = mapper;

		// Call method under test
		ResponseEntity<PlayListDto> response = controller.makeAPlaylist();
		
		// Assert
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
		assertEquals(dto, response.getBody());
	}
    
}
