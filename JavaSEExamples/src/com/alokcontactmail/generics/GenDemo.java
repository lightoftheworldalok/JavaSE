package com.alokcontactmail.generics;

public class GenDemo {

	public static void main(String[] args) {
		// Create a gen reference for Integer
		Gen<Integer> iOb; // Create a reference to and object type
		// Create a gen<Integer> object and assign its reference to iOb. Notice the use of autoboxing to encapsulate the value 88 within an Integer object 
		iOb = new Gen<Integer>(88);
		
		// show the type of data used by iOb 
		
		iOb.showType();
		
		// get the value in iOb notice that no cast is need.
		
		int v = iOb.getOb();
		System.out.println("Value : "+v);
		System.out.println();
		// Create a gen object for Strings.
		Gen<String> strOb = new Gen<String>("Generic test");
		
		// show type
		
		strOb.showType();
		
		String str = strOb.getOb();
		System.out.println("value: "+str);
		

	}

}
