package com.alokcontactmail.generics;

public class GenIFDemo {

	public static void main(String[] args) {
		Integer [] x = {1,2,3};
		MyClass<Integer> ob = new MyClass<>(x);
		if(ob.contains(2)) {
			System.out.println("2 is in ob");
		}else {
			System.out.println("2 is NOT in ob");
		}
		if(ob.contains(5)) {
			System.out.println("5 is in ob");
		}else {
			System.out.println("5 is NOT in ob");
		}
		// The following is illegal because ob is an Integer Containment and 9.25 is a double value
		// if(ob.contains(9.25))
		// 	System.out.println("9.25 is in ob");
	}

}
