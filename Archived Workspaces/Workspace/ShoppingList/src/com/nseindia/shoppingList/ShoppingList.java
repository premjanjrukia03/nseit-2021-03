package com.nseindia.shoppingList;

import java.util.*;

public class ShoppingList {

	private List<String> list = new Stack<String>();
	
	// Abstraction
	// Polymorphism
	
	
	//CRUD
	// Create
		// add
	// addMany
	// Read
		// print
		// getIndex
	// Update
	// Delete
	
	public boolean add(String itemName) {
		//
		
		//
		list.add(itemName);
		return true;
	}
	
	// addList
	
	public boolean add(String itemName, String itemName1) {
		list.add(itemName);
		list.add(itemName1);
		return true;
	}
	
	public boolean add(ShoppingList sList) {

		list.addAll(sList.list); // method of obj1 is able to access private field of obj2
//		the objects need to be of the same class
//		for(int i=0; i< sList.list.size();i++) { // 
//			list.add(sList.list.get(i));
//		}
		return true;
	}
	public void print() {
		if(list.isEmpty()) {
			System.out.println("The List is empty");
			return;
		}
		
		System.out.println("Your shopping list has " + list.size() + " items"
				+ ". They are: ");
//		 Iterator<E> iterator()
		 Iterator<String> iter = list.iterator();
		
//		ListIterator<E>
//		ListIterator<String> iter = list.listIterator();
		 
	
		 
		 while(iter.hasNext()) {
			 int i = 0;
//			 int i = iter.nextIndex();
			 String value = iter.next();
//			 iter.previous()
//			 iter.set(value);
			 
			 System.out.println(i+1 + ". " + value);
			 i++;
	 }
		 
//		 while(iter.hasNext()) {
//			 String value = iter.next();
//			 System.out.println(i + ". " + value);
//			 i++;
//		 }
		
//		for(int i=0; i< list.size();i++) { // 
//			System.out.println(i+1 + ". " + list.get(i)); // list[i]
//		}
				
	}
	
	public String deleteInd(int index) {
		if (index>=list.size()) {
			return null;
		}
		return list.remove(index);
		
	}
	
	public String deleteItem(String item) {
		boolean removed = list.remove(item);
		
		if (removed) {
			return item;
		} else {
			return null;
		}
	}
	
	public void updateItem(int index, String newItem) {
		if (index>=list.size()) {
			System.err.println("Out of bound when trying to update");
			return;
		}
		list.set(index, newItem);
	}
	
	public void updateItem(String oldItem, String newItem) {
		int index = list.indexOf(oldItem);
		
		if(index>=0) {
			list.set(index, newItem);
		} else if (index==-1) {
			System.err.println(oldItem + " not found in the list");
		}
	}
	
	public String toString() {
		return list.toString();
	}
	
}

// Item Name String // 
// items/products/ingredients
// totalItems
// price
// quantity
// product brand