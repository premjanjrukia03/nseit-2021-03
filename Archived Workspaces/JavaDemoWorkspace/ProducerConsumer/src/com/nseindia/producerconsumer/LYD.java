package com.nseindia.producerconsumer;

import java.util.*;


/*
 * LYD is leap year detector
 */
public class LYD {
	List<Integer> inputYears = new ArrayList<Integer>();
	List<String> output = new ArrayList<String>();
	boolean pFinished = false;
	
	public List<Integer> getInputYears() {
		return inputYears;
	}
	public void setInputYears(List<Integer> inputYears) {
		this.inputYears = inputYears;
	}
	public List<String> getOutput() {
		return output;
	}
	public void setOutput(List<String> output) {
		this.output = output;
	}
	@Override
	public String toString() {
		return "LYD [inputYears=" + inputYears + ", output=" + output + "]";
	}
}

class Consumer implements Runnable{
	private LYD lyd;
	@Override
	public void run() {
//		
		int counter =0;
		while(!lyd.pFinished || !lyd.inputYears.isEmpty() ) {
			if(!lyd.inputYears.isEmpty() ) {
				counter++;
				synchronized (lyd) {
					if (lyd.inputYears.isEmpty()) {
						continue;
					}
					int year = lyd.inputYears.remove(0); // state of the array is change
					if (year % 4 == 0) {
						lyd.output.add(year + " is a leap year");
					} else {
						lyd.output.add(year + " is not a leap year");
					}	
					System.out.println(lyd);
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			
		
		System.out.println("Consumer terminated with " + counter + " hits");
		
	}
	
	public Consumer(LYD lyd) {
		this.lyd = lyd;
	}
	
}


class Producer implements Runnable{
	private LYD lyd;

	
	@Override
	public void run() {
//		for (int i=0; i<arr.length;i++) {
//			synchronized (lyd) {				
//				lyd.inputYears.add(arr[i]); // state of the list
//				System.out.println(lyd);			
//			}
//		}
		
		int i;
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("Enter a leap year(0 to exit): ");
			if (scan.hasNext()) {
				i = scan.nextInt();
				synchronized (lyd) {		
					if (i==0) {	
						lyd.pFinished=true;
						break;
					}
					lyd.inputYears.add(i); // state of the list
					System.out.println(lyd);		
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		}
		
		System.out.println("Producer terminated");
	}
	
	public Producer(LYD lyd) {
			this.lyd = lyd;

	}
	
}