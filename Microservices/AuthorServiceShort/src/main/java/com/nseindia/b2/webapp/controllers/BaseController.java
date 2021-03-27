package com.nseindia.b2.webapp.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nseindia.b2.webapp.entities.Author;
import com.nseindia.b2.webapp.models.Book;
import com.nseindia.b2.webapp.repositories.Repository;

@RestController
public class BaseController {
	@Autowired
	Repository repo;

	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/")
	public List<Author> readAll() {
		List<Author> list = new ArrayList<Author>();

		repo.findAll().forEach(author -> {
			author.getBookIds().forEach((i) -> {
				Book b = restTemplate.getForObject("http://BOOKS/" + i, Book.class);
				if (b != null) {
					author.getBooks().add(b.getName());
				}
			});
			list.add(author);
		});
		return list;
	}

	@GetMapping("/{id}")
	public Author read(@PathVariable("id") Long id) {
		Author author = repo.findById(id).orElse(null);
		if (author != null) {
			author.setBooks(new HashSet<String>());

			author.getBookIds().forEach((i) -> {
				Book b = restTemplate.getForObject("http://BOOKS/" + i, Book.class);
				if (b != null) {
					author.getBooks().add(b.getName());
				}
			});
		}
		return author;
	}

	@PostMapping("/")
	public Author add(@RequestBody Author author) {
		author.setId(null);
		
		author= repo.save(author);
		final Long i = author.getId();
		
		if (!author.getBookIds().isEmpty()) {
			author.getBookIds().forEach(id -> {
				Book b = restTemplate.getForObject("http://BOOKS/"+ id, Book.class);
				if (b!=null) {					
					b.getAuthorIds().add(i);
					restTemplate.put("http://BOOKS/"+ id, b);
				}
			});
		}
		return author;
	}

	@PutMapping("/{id}")
	public Author update(@PathVariable("id") Long id, @RequestBody Author author) {
		Author a = repo.findById(id).orElse(null);

		if (a != null) {
			if (author.getName() != null) {
				a.setName(author.getName());
			}
			if (author.getBookIds() != null) {
				a.setBookIds(author.getBookIds());
			}
			author = repo.save(a);
		}

		return author;
	}

	@DeleteMapping("/{id}")
	public Author delete(@PathVariable("id") Long id) {
		Author a = repo.findById(id).orElse(null);

		if (a != null) {
			repo.deleteById(id);
		}

		return a;
	}
}

// Post Data
//{
// 
//    "name": "Faiz",
//    "bookIds": []
//}