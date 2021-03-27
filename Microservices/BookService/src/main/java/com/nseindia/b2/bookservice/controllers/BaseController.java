package com.nseindia.b2.bookservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nseindia.b2.bookservice.entities.Book;
import com.nseindia.b2.bookservice.models.Request;
import com.nseindia.b2.bookservice.models.Response;
import com.nseindia.b2.bookservice.models.ResponseList;
import com.nseindia.b2.bookservice.services.BookService;

@RestController
public class BaseController {
	@Autowired
	BookService service;

	@GetMapping("/")
	public ResponseList getAll() {
		ResponseList resp = new ResponseList();
		resp.setBooks(service.readAll());

		if (resp.getBooks() != null) {
			resp.setMessage("Books retrieved Successfully");
		} else {
			resp.setMessage("Retrieval Failed");
		}

		return resp;
	}

	@GetMapping("/{id}")
	public Response get(@PathVariable Long id) {
		Response resp = new Response();
		resp.setBook(service.read(id));
		if (resp.getBook() != null) {
			resp.setMessage("Book Retrieved Successfully");
		} else {
			resp.setMessage("Book with the specified id not found");
		}

		return resp;
	}

	@PostMapping("/")
	public Response add(@RequestBody Request req) {
		Response resp = new Response();
		Book book = req.toBook();

		book = service.add(book);

		resp.setMessage("Book Added Successfully");
		resp.setBook(book);

		return resp;
	}

	@PutMapping("/{id}")
	public Response update(@RequestBody Request req, @PathVariable("id") Long id) {
		Response resp = new Response();

		Book book = service.update(id, req.toBook());
		resp.setBook(book);
		if (book != null) {
			resp.setMessage("Record updated Successfully");
		} else {
			resp.setMessage("Record not found");
		}

		return resp;
	}

	@DeleteMapping("/{id}")
	public Response delete(@PathVariable("id") Long id) {
		Response resp = new Response();

		Book book = service.delete(id);
		resp.setBook(book);
		if (book != null) {
			resp.setMessage("Record deleted Successfully");
		} else {
			resp.setMessage("Record not found");
		}

		return resp;

	}

}
