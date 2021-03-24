package com.nseindia.b2.simplehttpapi.controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {
	
//	@RequestMapping(path="/",method=RequestMethod.GET)
	@GetMapping("/")
	public String index() {
		return "Accessing / via GET method";
	}  
	
//	@RequestMapping(path="/",method=RequestMethod.POST)
	@PostMapping("/")
	public String postIndex() {
		return "Accessing / via Post method";
	}
	
//	@RequestMapping(path="/",method=RequestMethod.PUT)
	@PutMapping("/")
	public String putIndex() {
		return "Accessing / via PUT method";
	}
	
//	@RequestMapping(path="/",method=RequestMethod.DELETE)
	@DeleteMapping("/")
	public String deleteIndex() {
		return "Accessing / via Delete method";
	}
	
	
	@GetMapping("/testInt")
	public int testInt() {
		return 2;
	}
} 
