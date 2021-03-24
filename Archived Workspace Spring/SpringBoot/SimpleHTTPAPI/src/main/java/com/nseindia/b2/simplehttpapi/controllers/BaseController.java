package com.nseindia.b2.simplehttpapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
public class BaseController {

	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	// To access this browse to http://localhost:8080/test
	// This function will work for the file /hello
	// This function will not work for the folder /hello/
	@RequestMapping("/test")
	public String testFile() {
		return "This is a test file";
	}
	
	
	// To access this browse to http://localhost:8080/test/
	// Which means the paths "/test" and "/test/" are not the same
	@RequestMapping("/test/")
	public String testFolder() {
		return "This is a test folder";
	}
	
	
	// Assuming that we only have a mapping for "/test1" and no mapping for "/test1/" 
	// Then if you browse to http://localhost:8080/test1/
	// then it will run the function for mapping "/test1"
	// It doesn't work the other way around
	@RequestMapping("/test1")
	public String testFileFolder() {
		return "This is a test1 file";
	}
	
	
	
	//	You can have complex paths as well
	@RequestMapping("/dir1/dir2/test")
	public String testComplexPath() {
		return "This is a message which is inside subdirectories";
	}
}
