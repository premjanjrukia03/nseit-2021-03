package com.nseindia.b2.industrybpdi.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.nseindia.b2.industrybpdi.models.Message;


@Component
public class CLIMessageService implements MessageService {
	@Autowired
	public Message messageO;
	// Message message0 = ctx.getBean("message")


	@Override
	public void readMessage() {
		System.out.print("CLI0: Your Message was: ");
		System.out.println(messageO.getMessage());

	}

	@Override
	public void addMessage() {
		System.out.print("CLI0: Enter your message: ");
		Scanner scan = new Scanner(System.in);
		String m = scan.nextLine();
		this.messageO.setMessage(m);
	}

}
