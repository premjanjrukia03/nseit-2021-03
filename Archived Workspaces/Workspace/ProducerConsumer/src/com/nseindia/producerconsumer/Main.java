package com.nseindia.producerconsumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LYD lyd = new LYD();
		int[] arr = new int[] {100,220002,12312,21312,213123,123,123,123,1222};
		int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9};
		
		
		Thread producer = new Thread(new Producer(lyd,arr));
		Thread producer1 = new Thread(new Producer(lyd,arr1));
		Thread consumer = new Thread(new Consumer(lyd));
		Thread consumer1 = new Thread(new Consumer(lyd));
		
		
		producer.start();
//		producer1.start();
		
		consumer.start();
		consumer1.start();
		
		
//		System.out.println(lyd);
		
	}

}
