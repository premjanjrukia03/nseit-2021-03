package com.nseindia.producerconsumer;

public class Main {

	public static void main(String[] args) {
		LYD lyd = new LYD();
		Thread producer = new Thread(new Producer(lyd));
		Thread consumer = new Thread(new Consumer(lyd));
		Thread consumer1 = new Thread(new Consumer(lyd));
		
		producer.start();
		consumer.start();
		consumer1.start();
	}

}
