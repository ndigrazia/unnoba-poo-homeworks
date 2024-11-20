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
public class PlayListDto {
    
    private Integer id;
    private String name;
    private String ownerUsername;

}
