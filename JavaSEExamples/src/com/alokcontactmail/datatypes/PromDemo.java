package com.alokcontactmail.datatypes;

public class PromDemo {

	public static void main(String[] args) {
		byte b;
		int i;
		b = 10;
		i = b*b; // Ok no  cast needed
		b = 10;
		b = (byte)(b*b);// caste needed
		System.out.println("i and b: "+i+" "+b);

	}

}
