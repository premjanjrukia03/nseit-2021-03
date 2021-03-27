package com.nseindia.b2.webapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nseindia.b2.webapp.entities.Book;
import com.nseindia.b2.webapp.repositories.Repository;

@RestController
public class BaseController {
	@Autowired 
	Repository repo;

	@GetMapping("/")
	public List<Book> readAll() {
		List<Book> list = new ArrayList<Book>();

		repo.findAll().forEach(author -> {
			list.add(author);
		});
		return list;
	}

	@GetMapping("/{id}")
	public Book read(@PathVariable("id") Long id) {
		Book book = repo.findById(id).orElse(null);
		return book;
	}

	@PostMapping("/")
	public Book add(@RequestBody Book book) {
		book.setId(null);
		return repo.save(book);
	}

	@PutMapping("/{id}")
	public Book update(@PathVariable("id") Long id, @RequestBody Book book) {
		Book a = repo.findById(id).orElse(null);

		if (a != null) {
			if (book.getName() != null) {
				a.setName(book.getName());
			}
			if (book.getAuthorIds() != null) {
				a.setAuthorIds(book.getAuthorIds());
			}
			book = repo.save(a);
		}

		return book;
	}

	@DeleteMapping("/{id}")
	public Book delete(@PathVariable("id") Long id) {
		Book a = repo.findById(id).orElse(null);

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