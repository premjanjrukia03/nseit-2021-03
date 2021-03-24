package com.nseindia.collections;

public class Student implements Comparable<Student>{
	int id;
	String Name;
	
	public Student() {
		
	}
	
	public Student(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", Name=" + Name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
	public int compareTo(Student s2) {
//		return 1 s1 > s2
//		return 0 s1 == s2
//		return -1 s1 < s2
//		int result;
//		if (id == s2.id) {
//			result = 0;
//		} else if (id < s2.id) {
//			result = -1;
//		} else {
//			result = 1;
//		}
		// 1
		// 3
		// -2
		// 1
		// 1
		// 0
		// 3-1
		// 2
			
		return this.id - s2.id;
	}

	
	
}
