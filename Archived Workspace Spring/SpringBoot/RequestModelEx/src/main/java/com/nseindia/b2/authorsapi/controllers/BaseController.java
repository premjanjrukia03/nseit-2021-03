package com.nseindia.b2.authorsapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nseindia.b2.authorsapi.models.Request;
import com.nseindia.b2.authorsapi.models.Response;

@RestController
public class BaseController {
	@PostMapping("/add")
	public Response add(@RequestBody Request req) {
		Response response = new Response();
		response.setSum(req.getNum1() + req.getNum2());
		return response;
	}
}
