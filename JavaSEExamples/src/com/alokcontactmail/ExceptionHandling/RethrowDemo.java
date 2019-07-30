package com.alokcontactmail.ExceptionHandling;

public class RethrowDemo {

	public static void main(String[] args) {
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException e) {
			// recatch exception
			
			System.out.println("Fatal error - "+"program terminated. ");
		}

	}

}
