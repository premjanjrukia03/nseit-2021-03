package com.nseindia.b2.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.nseindia.b2.webapp.models.PostAuthorRequest;
import com.nseindia.b2.webapp.models.PostAuthorResponse;

@Controller
public class BaseController{
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/addAuthor")
	public String add() {
		return "addAuthor";
	}
	
	@PostMapping("/addAuthor")
	public String addAuthor(@RequestParam("name") String name, @RequestParam("genre") String genre, Model model) {
		PostAuthorRequest author = new PostAuthorRequest(name,genre);
		
		PostAuthorResponse resp = restTemplate.postForObject(
				"http://localhost:8080/authors",
				author,
				PostAuthorResponse.class
				);
		model.addAttribute("resp", resp);
		
		return "addAuthor";
	}
}
