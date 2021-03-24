package com.example.demo.entities;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String genre;
	
	@ElementCollection
	private Set<String> books;
}
