package com.example.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PlayList {
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "PlayList_Songs",
		joinColumns = @JoinColumn(name = "playlist"),
		inverseJoinColumns = @JoinColumn(name = "song")
	)
    private List<Song> songs = new ArrayList<Song>();
    
    @ManyToOne(cascade = CascadeType.ALL)
    private User owner;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false)
    private String name;

}
