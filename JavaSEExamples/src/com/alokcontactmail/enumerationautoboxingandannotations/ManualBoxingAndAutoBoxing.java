package com.alokcontactmail.enumerationautoboxingandannotations;

public class ManualBoxingAndAutoBoxing {

	public static void main(String[] args) {
		// Manual boxing
		Integer iOb = new Integer(100); // boxing
		int i = iOb.intValue(); // unboxing
		System.out.println("i : "+i);
		//Auto boxing
		Integer iOb2 = 100;
		int j = iOb2;
		System.out.println("j : "+j);

	}

}
