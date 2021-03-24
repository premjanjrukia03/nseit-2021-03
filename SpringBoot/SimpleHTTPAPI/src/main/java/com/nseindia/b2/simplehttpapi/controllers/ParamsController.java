package com.nseindia.b2.simplehttpapi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class ParamsController {
	
	@RequestMapping("/hello/{name}")
	public String testParams(@PathVariable String name) {
		return "Hello " + name;
	}
//	// Example url http://localhost:8080/hello/faiz/age/29
//	@RequestMapping("/hello/{name}/age/{age}")
//	public String testMultiParams(@PathVariable String name, @PathVariable int age) {
//		return "Hello " + name + " whose age is " + age;
//	}
	
	
	@RequestMapping("/hello/{firstName}/age/{age}")
	public String testMultiParamsDifferentVariableName(@PathVariable("firstName") String name, @PathVariable int age) {
		return "Hello " + name + " whose age is " + age;
	}
}
