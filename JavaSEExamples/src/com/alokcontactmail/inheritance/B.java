package com.alokcontactmail.inheritance;

public class B extends A{
	void meth() { // Error can not override 
		System.out.println("Illegal");
	}
}
