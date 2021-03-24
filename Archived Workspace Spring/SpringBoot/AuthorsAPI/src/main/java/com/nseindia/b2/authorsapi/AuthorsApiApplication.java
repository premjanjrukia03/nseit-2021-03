package com.nseindia.b2.authorsapi;

import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.nseindia.b2.authorsapi.models.Author;


// In  this project we will write CRUD Operations
// for managing data of Book Authors
@SpringBootApplication
public class AuthorsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorsApiApplication.class, args);
	}
	
	@Bean
	public List<Author> createAuthor(){
		return new LinkedList<Author>();
	}

}
