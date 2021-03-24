package com.nseindia.b2.se.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseControlller {
	
	@Autowired
	PasswordEncoder pe;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/secureURL")
	public String secureURL() {
		return "secureURL";
	}
	
	@RequestMapping("/insecureURL")
	public String insecureURL() {
		return "insecureURL";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	// The following should not be present in your production application
	@GetMapping("/hashString/{str}")
	@ResponseBody
//	This annotation makes it work like a @RestController
	public String hashString(@PathVariable String str) {
		return pe.encode(str);
	}
	
}
