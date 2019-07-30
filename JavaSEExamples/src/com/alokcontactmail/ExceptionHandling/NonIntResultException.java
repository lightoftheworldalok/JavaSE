package com.alokcontactmail.ExceptionHandling;

public class NonIntResultException extends Exception {
	int n;
	int d;
	
	public NonIntResultException(int i,int j) {
		super("Result is not an Integer.");
		n = i;
		d = j;
	}
	public String toString() {
		return "Result of "+n+" / "+d+" is non-integer ";
	}
}
