package com.nseindia.b2.authorsapi.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
import com.nseindia.b2.authorsapi.models.ResponseAuthor;
import com.nseindia.b2.authorsapi.services.AuthorService;

@RestController
@RequestMapping("/authors")
// The above request mapping uses /authors as a prefix for all mappings inside the controller
public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	@PostMapping
	public ResponseAuthor add(@RequestBody Author author) {
		ResponseAuthor response;
		
		// Any validation, and exception handling should be present inside the service
		authorService.add(author);
		
		response = new ResponseAuthor(author,"Record added Successfully");
		
		return response;
	}
	
	@GetMapping
	public List<ResponseAuthor> readAll(){
		List<ResponseAuthor> respList = new ArrayList<ResponseAuthor>();
		List<Author> authorList = authorService.readAll();
		
//		for (int i= 0;i<authorList.size();i++) {
////			Author author = authorList.get(i);
////			ResponseAuthor response = new ResponseAuthor(author);
////			respList.add(response);
//			respList.add(new ResponseAuthor(authorList.get(i)));
//		}
		
		authorList.stream()
		.forEach(author -> {
			respList.add(new ResponseAuthor(author));
		});
	
		
		return respList;
	}
	
	@GetMapping("/{id}")
	public ResponseAuthor read(@PathVariable Long id) {
		ResponseAuthor response;
		
		Author author = authorService.read(id);
		
		if (author!=null) {
			response = new ResponseAuthor(author);
		} else {
			response = new ResponseAuthor("Record with id " + id + " not found!");
		}
		
		return response;
	}
	
	@DeleteMapping("/{id}")
	public ResponseAuthor delete(@PathVariable Long id) {
		ResponseAuthor response;
		Author author = new Author();
		author = authorService.delete(id);
		
		if (author!=null) {
			response = new ResponseAuthor(author,"Record Deleted Successfully");
		} else {
			response = new ResponseAuthor("Record with id " + id + " not found");
		}
		
		return response;
	}
	
	@PutMapping("/{id}")
	public ResponseAuthor update(@PathVariable Long id, @RequestBody Author author) {
		ResponseAuthor response;
		author = authorService.update(id, author);
		// you can also do it this way
		// Author a = authorSerivce.update(id,author);
		
		if (author!=null) {
			response = new ResponseAuthor(author,"Record Updated Successfully");
		} else {
			response = new ResponseAuthor("Record with id " + id + " not found");
		}
		
		
		return response;
	}
	
}
