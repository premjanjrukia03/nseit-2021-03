package com.nse.concurrency;

public class MyRunnable implements Runnable{
	
	String Name="RunnableThread";


	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + Name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void setName(String str) {
		Name = str;
	}
}
