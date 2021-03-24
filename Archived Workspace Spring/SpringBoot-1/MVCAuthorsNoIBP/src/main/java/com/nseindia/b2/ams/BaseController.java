package com.nseindia.b2.ams;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/authors")
public class BaseController {

	List<Author> list = new ArrayList<Author>();

	@GetMapping("/")
	public String index(Model model) {
		boolean empty = list.isEmpty();
//		 TODO return all authors
	
		
		model.addAttribute("isEmpty",empty);
		model.addAttribute("authors", list);
		return "index";
	}

	@GetMapping("/{id}")
	public String read(@PathVariable("id") Integer id, Model model) {
//		 TODO return all authors
		Author author = null;
		boolean found = false;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				author = list.get(i);
				found = true;
				break;
			}
		}
		model.addAttribute("found",found);
		model.addAttribute("author", author);
		return "view";
	}

	@GetMapping("/add")
	public String addGet() {
		return "add";
	}

	@PostMapping("/add")
	// Request body is not working
	public String addPost(@RequestParam("id") Integer id, @RequestParam("name") String name, Model model) {
//		TODO add a record
		
		Author author = new Author(id, name);

		list.add(author);

		
		model.addAttribute("message","Record with id "+id + " added Successfully");
		return "add";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id, Model model) {
		Author author = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				author = list.remove(i);
				break;
			}
		}
		
		model.addAttribute("author",author);
		
		return "delete";
	}

	@PostMapping("/update/{id}")
	public String update() {
		return "update";
	}

}
