package com.nseindia.students;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInterface student1 = new Grades("Faiz",1,99,77,70,98,50);
		StudentInterface student2 = new Grades("Prem",1,99,77,70,98,50);
		
		student1.calculateTotal();
		student2.calculateTotal();
		
		System.out.println(student1);
		System.out.println("Grade is " + student1.getGrade() + " for student1");
		System.out.println(student2);
		System.out.println("Grade is " + student2.getGrade() + " for student2");
	}

}
