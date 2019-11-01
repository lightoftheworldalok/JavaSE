package com.alokcontactmail.javaUtil;

import java.util.Formatter;

public class LeftJustify {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		
		// Right justify by default
		fmt.format("|%10.2f|\n", 123.123);
		
		// Now left justify.
		fmt.format("|%-10.2f|", 123.123);
		
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%+.2f", 100.25);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%.2f\n", -100.25);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("% .2f", 100.25);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%(.2f", -100.25);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%07.2f\n", 1.23);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%,.2f", 4356783497.34);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%#x\n", 250);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%#X\n", 250);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%e\n", 123.1234);
		System.out.println(fmt);
		System.out.println("==================================================");
		fmt.format("%E", 123.1234);
		System.out.println(fmt);
		fmt.close();

	}

}
