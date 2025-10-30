package com.example.torneos;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.torneos.util.PasswordEncoder;

@Configuration
public class Application {

    @Bean
    public PasswordEncoder encode() {
        return new PasswordEncoder();
    }

    @Bean
    public ModelMapper mapper() {
        ModelMapper modelMapper = new ModelMapper();

        /*modelMapper.typeMap(Song.class, SongDto.class).addMappings(mapper -> {
            mapper.map(src -> src.getAuthor().getUsername(), SongDto::setUsername);
        });*/
        
        return modelMapper;
    }
    
}
