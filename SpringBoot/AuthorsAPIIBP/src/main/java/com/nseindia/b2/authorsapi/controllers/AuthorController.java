package com.nseindia.b2.authorsapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nseindia.b2.authorsapi.models.Author;
import com.nseindia.b2.authorsapi.services.AuthorService;

@RestController
@RequestMapping("/authors")
// The above request mapping uses /authors as a prefix for all mappings inside the controller
public class AuthorController {
	@Autowired
	AuthorService authorService;

	
	@PostMapping("/")
	public Author add(@RequestBody Author author) {
		// Any validation, and exception handling should be present inside the service
		return authorService.add(author);
	}
	
	@GetMapping("/")
	public List<Author> readAll(){
		return authorService.readAll();
	}
	
	@GetMapping("/{id}")
	public Author read(@PathVariable Long id) {
		return authorService.read(id);
	}
	
	@DeleteMapping("/{id}")
	public Author delete(@PathVariable Long id) {
		return authorService.delete(id);
	}
	
	@PutMapping("/{id}")
	public Author update(@PathVariable Long id, @RequestBody Author author) {
		return authorService.update(id, author);
	}
	
}
