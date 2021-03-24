package com.nseindia.b2.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RestController
public class BaseController {
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
}
