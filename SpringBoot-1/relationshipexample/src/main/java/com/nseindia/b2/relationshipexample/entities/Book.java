package com.nseindia.b2.relationshipexample.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	
	@ManyToOne
	private Publisher publisher;
	@ManyToMany
	@JoinTable // the table that you want to give the owner, use @JoinTable along with ManyToMany
	private Set<Author> authors;
}
