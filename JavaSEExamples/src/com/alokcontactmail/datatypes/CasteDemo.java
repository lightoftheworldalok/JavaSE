package com.alokcontactmail.datatypes;
// using cast
public class CasteDemo {

	public static void main(String[] args) {
		double x,y;
		byte b;
		int i;
		char ch;
		x =10.0;
		y = 3.0;
		i = (int )(x/y);// cast double to int 
		System.out.println("i : "+i);
		
		i=100;
		b = (byte)i; // No loss of info here A byte can hold the value 100;
		System.out.println("Vlaue of b: "+b);// -128-127
		i = 257;
		b = (byte)i; // information loss this time. A byte cannot hold the value 257
		System.out.println("Value of b :"+b);
		
		b = 88;
		ch = (char)b; // cast byte to char
		System.out.println("ch: "+ch);
	}

}
