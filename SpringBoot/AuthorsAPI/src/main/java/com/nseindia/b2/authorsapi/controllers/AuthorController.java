package com.nseindia.b2.authorsapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nseindia.b2.authorsapi.models.Author;

@RestController
public class AuthorController {

	// We can have multiple Authors but we will have a single AuthorList
	@Autowired
	public List<Author> authorList;

	@GetMapping("/authors")
	public List<Author> readAll() {
//		return authorList.toString();
		return authorList;
	}

	@GetMapping("/authors/{id}")
	public Author read(@PathVariable Long id) {
		for (int i = 0; i < authorList.size(); i++) {
			if (authorList.get(i).getId() == id) {
				return authorList.get(i);
			}
		}

		return new Author();
	}

	@PostMapping("/authors")
	public Author add(@RequestBody Author author) {
		authorList.add(author);
//		return "Successfully Added: " + author.toString();
		return author;
	}
	// Postman JSON for testing
	/*
	 * { "id": 1, "name": "Faiz", "genre": "Technical", "books": [
	 * "NoBooks Written"] }
	 */

	// Test 2
	/*
	 * { "id": 1, "name": "Faiz", "genre": "Technical" }
	 */

	// Test 3
	/*
	 * { "id": 1, "name": "Faiz", "genre": "Technical", "numberOfBooks":3 }
	 */

	// Best Practice is to use sort, and delete with binarySearch
	@DeleteMapping("/authors/{id}")
	public Author delete(@PathVariable Long id) {
		for (int i = 0; i < authorList.size(); i++) {
			if (authorList.get(i).getId() == id) {
				return authorList.remove(i);
			}
		}
		return new Author();
	}

	@PutMapping("/authors/{id}")
	public Author update(@PathVariable("id") Long id, @RequestBody Author author) {
		for (int i = 0; i < authorList.size(); i++) {
			if (authorList.get(i).getId() == id) {

				if (author.getId() != null)
					authorList.get(i).setId(author.getId());

				if (!author.getBooks().isEmpty())
					authorList.get(i).setBooks(author.getBooks());

				if (author.getGenre() != null)
					authorList.get(i).setGenre(author.getGenre());

				if (author.getName() != null)
					authorList.get(i).setName(author.getName());

				return authorList.get(i);
			}
		}
		return new Author(); // placeholder for now, we will come and make it better later
	}
}
