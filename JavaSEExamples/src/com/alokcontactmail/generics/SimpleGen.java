package com.alokcontactmail.generics;

public class SimpleGen {

	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
		// show the types 
		tgObj.showType();
		
		// Obtain and show value 
		int v = tgObj.getOb1();
		String str = tgObj.getOb2();
		System.out.println("Value of V is : "+v+" Value of str is : "+str);

	}

}
