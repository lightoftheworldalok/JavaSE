package com.alokcontactmail.ExceptionHandling;

public class ThrowDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Before throw. ");
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			// catch the exception 
			System.out.println("Exception cought. ");
		}
		System.out.println("After  try/catch block. ");
	}

}
