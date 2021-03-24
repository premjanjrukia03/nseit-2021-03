package com.nseindia.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	// List is not a reserved word
	
	
	
	public static void run() {
		List<Student> list = new LinkedList<Student>();
		
		Student s;
		
		s = new Student(1,"Faiz");
		list.add(s);
		s = new Student(22,"Manas");
		list.add(s);
		s = new Student(13,"Swanit");
		list.add(s);
		s = new Student(100,"Dhanalakshmi");
		list.add(s);
		s = new Student(28,"Asmita");
		list.add(s);
		s = new Student(27,"Asmita");
		list.add(s);
		
		int resultIndex;
		Student search = new Student();
		search.setName("Dhanalakshmi");
		
		System.out.println(list);
		Comparator<Student> compID = new StdIdComparator();
		Comparator<Student> compName = new StdNameComparator();
		
//		Collections.sort(list, compID);
//		System.out.println(list);
//		
		
//		Collections.sort(list, compName);
//		System.out.println(list);
		
//		Collections.sort(list);
//		resultIndex = Collections.binarySearch(list, search);

//		Collections.binarySearch(list, searchStudent(withName), comparator);
		Collections.sort(list,compName);
		resultIndex = Collections.binarySearch(list, search, compName);
		
		System.out.println(resultIndex);
		System.out.println(list.get(resultIndex));
		
//		i+j
		
		
//		Integer i;
//		
//		// boxing
//		i = Integer.valueOf(3);
//		
//		// unboxing
//		int j;
//		j = i.intValue();
//		
//		//auto boxing
//		Integer k = 3;
//		//k = Integer.valueOf(3);
//		
//		
//		//auto unboxing
//		int l = k;
//		// l = k.intValue();
	}
	

}
