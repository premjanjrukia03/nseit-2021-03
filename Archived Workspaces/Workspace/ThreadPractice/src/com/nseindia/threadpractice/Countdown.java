package com.nseindia.threadpractice;

public class Countdown {
	Integer i;
	public void startCountdown(String cdName) {
		
		System.out.println("Inside Countdown");
		for (i=10; i>=0;i--) {
			//t1 i=10
			// tx i=10
			synchronized (i) {	
				System.out.println(cdName + " " + i);
			}
		} //t1 i--
	}
	// t1 locked this method out
	// t2 waits for this method to get unlocked
	
}


// T1 i =10
// T1 prints 10
// T2 i=10
// T1 i=9
// T2 print 10
// T2 i-> 9
// T1 i->8
