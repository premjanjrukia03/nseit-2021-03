package com.nseindia.b2.thyme.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {
	
	@GetMapping("/")
	public String index(Model model) {
//		String[] arr = {"Hello","World","!"};
//		int[] arr = {1,2,3,4,5};
		List<String> arr = new ArrayList<String>();
		arr.add("Hello");
		arr.add("World");
		arr.add("!");
		
		model.addAttribute("msg",arr);
		return "index";
	}
}
