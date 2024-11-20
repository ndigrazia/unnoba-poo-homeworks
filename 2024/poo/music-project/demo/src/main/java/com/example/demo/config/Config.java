package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dto.SongDto;
import com.example.demo.entities.Song;

@Configuration
public class Config {

    @Bean
    public ModelMapper mapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.typeMap(Song.class, SongDto.class).addMappings(mapper -> {
            mapper.map(src -> src.getAuthor().getUsername(), SongDto::setUsername);
        });
        
        return modelMapper;
    }
    
}
