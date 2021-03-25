package com.nseindia.b2.webapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.nseindia.b2.webapp.models.Author;
import com.nseindia.b2.webapp.models.AuthorList;
import com.nseindia.b2.webapp.models.PostResponseAuthor;

@Controller
public class BaseController {
	@Autowired
	RestTemplate restTemplate;
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/author")
	public String author(Model model) {
		AuthorList authorList = restTemplate.getForObject("http://localhost:8081", AuthorList.class);
		model.addAttribute("message", authorList.getMessage());
		model.addAttribute("authors", authorList.getAuthors());
	
		return "author"; 
	}
	
	@GetMapping("/author/add")
	public String getAddAuthor() {
		return "authorDetails";
	}
	
	@PostMapping("/author/add")
	public String postAddAuthor(@RequestParam("name") String name, @RequestParam("book") List<String> books, Model model) {
		Author author = new Author();
		author.setName(name);
		author.setBooks(books);
		
		PostResponseAuthor respAuthor = restTemplate.postForObject("http://localhost:8081/", author, PostResponseAuthor.class);
		
		model.addAttribute("message",respAuthor.getMessage());
		
		return "authorDetails";
	}
}
