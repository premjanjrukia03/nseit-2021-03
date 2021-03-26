package com.nseindia.b2.simpleclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.nseindia.b2.simpleclient.models.Quote;

@Controller
public class BaseController {
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	WebClient.Builder webClient;

	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("quote");
		return "index";
	}

	// Retrieve Data using RestTemplate
	@GetMapping("/rest")
	public String getRestData(Model model) {
		// Doesn't return anything for 2 seconds
		Quote q = restTemplate.getForObject(
				"https://quoters.apps.pcfone.io/api/random",
				Quote.class);
		// Blocked here for 2 seconds
		model.addAttribute("quote", q);
		return "get";
	}

	// Retrieve Data using WebClient
	@GetMapping("/webclient")
	public String getWebData(Model model) {
		// The first thing it needs is a URI to build a request on.
		// You set one value at a time. and you chain the setters
		Quote q = webClient
			.baseUrl("https://quoters.apps.pcfone.io/api/random").build() // Created an HTTP object
			.get()   // I specified it's going to be a get request
			.retrieve() // Send the request
			.bodyToMono(Quote.class) // Parse the response using the class provided
			.block();
		
		model.addAttribute("quote", q);
//		System.out.println(q);
		return "get";
	}

	// Retrieve Data using OpenFeign
	@GetMapping("/feign")
	public String getFeignData() {
		// TODO Later
		return "index";
	}

}
