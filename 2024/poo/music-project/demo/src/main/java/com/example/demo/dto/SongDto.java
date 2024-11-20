package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter 
@Setter
@NoArgsConstructor
@Builder
public class SongDto {
  
    private String genre;
    private String username;
    private Integer id;
    private String name;

}
