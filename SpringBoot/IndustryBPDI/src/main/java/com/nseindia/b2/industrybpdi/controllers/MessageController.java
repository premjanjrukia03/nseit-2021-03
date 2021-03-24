package com.nseindia.b2.industrybpdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nseindia.b2.industrybpdi.services.MessageService;

@Controller
public class MessageController {
//	MessageService ms = new CLIMessageService();
	
	
//	@Qualifier("CLIMessageService")
	@Qualifier("anotherCLIMessageService")
	@Autowired
	MessageService ms;
	// MessageService ms = (CLIMessageService) ctx.getBean("cLIMessageService");
	
	@Qualifier("CLIMessageService")
	@Autowired
	MessageService ms1;
	
	public void run() {
		ms.readMessage();
		ms.addMessage();
		ms.readMessage();
//		
//		ms1.readMessage();
//		ms1.addMessage();
//		ms1.readMessage();
	}
}
