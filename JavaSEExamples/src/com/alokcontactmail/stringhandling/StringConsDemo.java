package com.alokcontactmail.stringhandling;

public class StringConsDemo {

	public static void main(String[] args) {
		
		char [] digits = new char[16];
		
		for (int i = 0; i < digits.length; i++) {
			if(i < 10 ) {
				digits[i] = (char)('0'+i);
			} else {
				digits [i] = (char)('A'+i-10);
			}
		}
		// Create a string that contains all of the array.
		String digitStr = new String(digits);
		System.out.println(digitStr);
		
		// create a string that contain all of array
		String nineToTewlve = new String(digits,9,4);
		System.out.println(nineToTewlve);
		
		String digiStr2 = new String(digitStr);
		System.out.println(digiStr2);
		String empty = new String();
		
		System.out.println("printing empty"+empty);

	}

}
