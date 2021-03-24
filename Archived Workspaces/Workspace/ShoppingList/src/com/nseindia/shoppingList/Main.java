package com.nseindia.shoppingList;

public class Main {

	public static void main(String[] args) {
		
		int index = 3;
		ShoppingList list = new ShoppingList();
		
		list.add("Bananas");
		list.add("Apples");
		list.add("Soap","Detergent");
		list.add("Soap");
		list.add("Soap2");
		list.print();
//		list.deleteInd(index);
//		list.updateItem("Soap", "New Soap");
//		list.print();
		
		
		ShoppingList list2 = new ShoppingList();
		
		list2.add("Britania Biscuits");
		list2.add("Yoghurt"); // this adds to list2.list
		list2.print();
		
		
		list.add(list2); //obj2 to obj1
		list.print();
		
		
		
		
	}

}
