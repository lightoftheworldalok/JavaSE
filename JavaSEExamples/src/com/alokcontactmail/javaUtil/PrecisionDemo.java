package com.alokcontactmail.javaUtil;

import java.util.Formatter;

public class PrecisionDemo {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		
		// Format 4 decimal places 
		fmt.format("%.4f\n", 123.1234567);
		// Format to 2 decimal places in a 16 character field
		fmt.format("%16.2e\n", 123.1234567);
		// Display at most 15 character in a string.
		fmt.format("%.15s\n", "Formatting with java is now easy.");
		System.out.println(fmt);
		fmt.close();
	}

}
