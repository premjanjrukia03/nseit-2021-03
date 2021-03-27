package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController
public class BaseController {
	@Autowired
	Repository repo;
	@GetMapping("/")
	public String test() {
		return "Test";
	}
	
	@PostMapping("/verify")
	public Boolean verifyCredentials(@RequestBody Request req) {
//		repo.findById(username).orElse(null);
		
		// This is not how you should do it in your assessment
		// This is just for a simple example
		User user = new User();
		
		user.setUsername("test");
		user.setPassword("test");
		System.out.println(user.getPassword());
		System.out.println(req.getPassword());
		return BCrypt.checkpw(req.getPassword(), user.getPassword());

	}
}
