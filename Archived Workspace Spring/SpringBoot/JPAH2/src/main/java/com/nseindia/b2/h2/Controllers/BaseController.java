package com.nseindia.b2.h2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nseindia.b2.h2.entities.Author;
import com.nseindia.b2.h2.repositories.AuthorRepository;

@Controller
public class BaseController {
	@Autowired
	AuthorRepository authorRepo;

	public void run() {
		System.out.println("------------------Task Stareted-----------------");

		// This creates because an entity with id 1 doesn't exist.
		Author author = new Author((long) 1, "Faiz", "Techincal");
		authorRepo.save(author);

		// This updates because an entity already exists with id 1.
		author = new Author((long) 1, "Mr. Faiz", "Techonology");
		authorRepo.save(author);

		// This creates because an entity with id 2 doesn't exist.
		author = new Author((long) 2, "Mr. Bill Gates", "Techonology");
		authorRepo.save(author);

		
		// If you want all values, this is what you have to do.
		authorRepo.findAll().forEach(a ->{
			System.out.println(a);
		});
		
		
		// Prints out an author
		author = authorRepo.findById((long) 2).orElse(null);
		System.out.println(author);
		
		// Delete an id
		authorRepo.deleteById((long)2);
		
		
		/*
		 *  func (Author a){
		 *  	System.our.println(a)
		 *  }
		 */
		
		System.out.println("-----------------Task Finished---------------");
	}
}
