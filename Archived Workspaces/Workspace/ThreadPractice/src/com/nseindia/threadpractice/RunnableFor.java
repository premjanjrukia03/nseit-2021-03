package com.nseindia.threadpractice;

/*
 * Runnable For is an example that demonstrates a for loop using threads
 */
public class RunnableFor implements Runnable{
	String Name;
	Countdown cd;
	
	public void run() {
		cd.startCountdown(Name);
	}

	public RunnableFor(Countdown cd) {
		this.cd = cd;
	}

	public RunnableFor(Countdown cd,String name ) {
		Name = name;
		this.cd = cd;
	}



	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
