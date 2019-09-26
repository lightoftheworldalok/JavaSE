package com.alokcontactmail.generics;

public class OverrideDemo {

	public static void main(String[] args) {
		// A gen reference that can refer to any type of Gen object 
		GenOverriding<?> gref;
		
		// create a GenOverriding object of integers
		GenOverriding<Integer> iOb = new GenOverriding<Integer>(2);
		
		// create a GenOverriding2 object of integer
		GenOverriding2<Integer> iOb2 = new GenOverriding2<Integer>(99);
		
		// Create a object of GenOverriding2 of String
		
		GenOverriding2< String> strObj = new GenOverriding2<String>("Generic Testing");
		
		gref = iOb;
		System.out.println(gref.getOb());
		
		gref = iOb2;
		System.out.println(gref.getOb());
		
		gref = strObj;
		System.out.println(gref.getOb());

	}

}
