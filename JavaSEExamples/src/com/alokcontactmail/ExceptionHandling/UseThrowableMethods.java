package com.alokcontactmail.ExceptionHandling;

public class UseThrowableMethods {

	public static void main(String[] args) {
		try {
			ExcTest.getException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Standard massage is: ");
			System.out.println(e);
			System.out.println("\n Stack trace: ");
			e.printStackTrace();
		}
		System.out.println("After Catch. ");
	}

}
