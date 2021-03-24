package com.nseindia.b2.relationshipexample.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@ManyToMany(mappedBy="authors") // Use mapped by if the other table has ownership.
	private Set<Book> books;
	@ManyToMany
	@JoinTable
	private Set<Publisher> publishers;
}
