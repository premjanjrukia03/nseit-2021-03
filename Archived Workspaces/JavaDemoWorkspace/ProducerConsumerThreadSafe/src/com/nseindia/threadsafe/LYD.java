package com.nseindia.threadsafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * LYD is leap year detector which is Thread Safe
 */
public class LYD {
	List<Integer> inputYears = new ArrayList<Integer>();
	List<String> output = new ArrayList<String>();
	boolean pFinished = false;
	
	// ------This is new from here
	
	public synchronized void add(Integer i) {
			this.inputYears.add(i);
			System.out.println(this.inputYears);
		}
	
	public synchronized void test() {
			if(this.inputYears.isEmpty()) {
				return;
			}
			int year;
			year = this.inputYears.remove(0); // state of the array is change			
		
				if (year % 4 == 0) {
					this.output.add(year + " is a leap year");
				} else {
					this.output.add(year + " is not a leap year");
				}	
			
			System.out.println(this);
	}
	
	
	// ------ till here
	
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
		while(!lyd.pFinished) {
			if(!lyd.inputYears.isEmpty() ) {
				counter++;
				lyd.test();
			}
			try {
				Thread.sleep(100);
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

	int[] arr= new int[]{};
	@Override
	public void run() {
		for (int j=0; j<arr.length;j++) {
				lyd.add(arr[j]); // state of the list
				System.out.println(lyd);			
		}
		
		int i;
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("Enter a leap year(0 to exit): ");
			if (scan.hasNext()) {
				i = scan.nextInt();	
				if (i==0) {
					lyd.pFinished=true;
					break;
				}
				
				lyd.add(i);
				
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
	public Producer(LYD lyd, int[]arr) {
		this.lyd = lyd;
		this.arr = arr;
	}
	
}