package com.nseindia.b2.authorservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nseindia.b2.authorservice.entities.Author;
import com.nseindia.b2.authorservice.models.Request;
import com.nseindia.b2.authorservice.models.Response;
import com.nseindia.b2.authorservice.models.ResponseList;
import com.nseindia.b2.authorservice.services.AuthorService;

@RestController
public class BaseController {
	@Autowired
	AuthorService service;

	@GetMapping("/")
	public ResponseList getAll() {
		ResponseList resp = new ResponseList();
		
		resp.setMessage("Records Retrieved Successfully");
		resp.setAuthors(service.readAll());
		
		return resp;
	}

	@GetMapping("/{id}")
	public Response get(@PathVariable Long id) {
		Response resp = new Response();

		resp.setAuthor(service.read(id));
		if (resp.author != null) {
			resp.setMessage("Record Retrieved Successfully");
		} else {
			resp.setMessage("Record not found");
		}

		return resp;
	}

	@PostMapping("/")
	public Response add(@RequestBody Request req) {
		Author author = req.toAuthor();

		author = service.add(author);

		Response resp = new Response();
		resp.setAuthor(author);
		resp.setMessage("Record Added Successfully");

		return resp;
	}

	@PutMapping("/{id}")
	public Response update(@RequestBody Request req, @PathVariable("id") Long id) {
		Response resp = new Response();
		Author author = req.toAuthor();
		author = service.update(id, author);
		if (author != null) {
			resp.setAuthor(author);
			resp.setMessage("Record Updated Successfully");
		} else {
			resp.setMessage("Record not found");
		}

		return resp;
	}

	@DeleteMapping("/{id}")
	public Response delete(@PathVariable("id") Long id) {
		Response resp = new Response();

		Author author = service.delete(id);

		if (author != null) {
			resp.setAuthor(author);
			resp.setMessage("Record Deleted Successfully");
		} else {
			resp.setMessage("Record not found");
		}

		return resp;

	}

}
