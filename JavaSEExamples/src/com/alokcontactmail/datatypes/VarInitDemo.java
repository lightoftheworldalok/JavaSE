package com.alokcontactmail.datatypes;

public class VarInitDemo {

	public static void main(String[] args) {
		int x;
		
		for (x = 0; x < 3; x++) {
			int y = -1; // y is initialized each time block is entered
			System.out.println("y is : "+y);// this always prints -1
			y = 100;
			System.out.println("y is now: "+y);
		}

	}
// this program attempts to declare a variable in an inner scope with the same name as one defined in an outer scope
}
