package com.nseindia.b2.thyme.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nseindia.b2.thyme.models.Message;

@Controller
public class BasicController {
////		@Value("The message is #{message.msg}")
//		@Value("The message is #{message.test()}")
//		public String test;
	
		@GetMapping("/")
		public String index(Model model) {
			Message msg = new Message();
			msg.setMsg("Passing an object");
//			model.addAttribute("message","Hello World");
			model.addAttribute("msg",msg);
			
//			System.out.println(test);
			
			return "index";
		}
		
		@GetMapping("/test/")
		public String test(Model model) {
			Message msg = new Message();
			msg.setMsg("Passing an object");
//			model.addAttribute("message","Hello World");
			model.addAttribute("msg",msg);
			
//			System.out.println(test);
			
			return "index";
		}
}
