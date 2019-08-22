package com.alokcontactmail.datatypes;
// Arithmetic operators
public class ModDemo {

	public static void main(String[] args) {
		int iresult, irem, x=10,y=100;
		double dresult, drem;
		iresult = 10/3;
		irem = 10 % 3;
		dresult = 10.0/3.0;
		drem = 10.0 % 3.0;
		System.out.println("Result and remainder of 10/3 : "+iresult+" "+irem);
		System.out.println("Result and remainder of 10/3 : "+dresult+" "+drem);
		// x++;
		System.out.println("x++: "+x++);
		System.out.println("x: after: "+x);
		// y--;
		System.out.println("y-- : "+ y--);
		System.out.println("y: after: "+y);
		//++x;
		System.out.println("x: before: "+x);
		System.out.println("++x: "+ ++x);
		--y;
		System.out.println("y: before: "+y);
		System.out.println("--y: "+ --y);
	}

}
