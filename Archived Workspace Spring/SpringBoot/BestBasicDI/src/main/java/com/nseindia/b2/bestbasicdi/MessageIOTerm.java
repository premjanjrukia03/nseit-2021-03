package com.nseindia.b2.bestbasicdi;

import java.util.Scanner;

/*
 * Responsible for IO fro/to from outside the code
 */
public class MessageIOTerm implements MessageIO {
	public Message messageO;

	public MessageIOTerm() {
		this.messageO = new Message();
	}
	
	
	@Override
	public void readMessage() {
		System.out.println("Your Message was:");
		System.out.println(messageO.getMessage());
	}
	
	@Override
	public void createMessage() {
		System.out.println("Enter your message:");
		Scanner scan = new Scanner(System.in);
		String m = scan.nextLine();
		this.messageO.setMessage(m);
	}
}
