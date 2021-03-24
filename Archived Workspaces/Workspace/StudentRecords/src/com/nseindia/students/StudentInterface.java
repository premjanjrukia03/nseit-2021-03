package com.nseindia.students;

public interface StudentInterface {
	
	/*
	 * calculateTotal should calculate the total from all 5 subjects and update the totall field
	 * it prints the total on the screen as well
	 */
	public void calculateTotal();
	public double getTotal();
	public String getGrade();
	public String toString();
}
