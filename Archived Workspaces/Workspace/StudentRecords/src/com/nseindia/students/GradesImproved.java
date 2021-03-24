package com.nseindia.students;

public class GradesImproved implements StudentInterface {

	@Override
	public void calculateTotal() {
		
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return 500;
	}

	@Override
	public String getGrade() {
		// TODO Auto-generated method stub
		return "A";
	}
	
	public String toString() {
		return "Good going Mate. You got 500/500, and a A grade";
	}

}
