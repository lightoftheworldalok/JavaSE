package com.alokcontactmail.javaUtil;

import java.util.Formatter;

public class GFormatDemo {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		for (double i = 1000; i < 1.0e+10; i*= 1000) {
			fmt.format("%g ", i);
			System.out.println(fmt);
		}
		fmt.close();
	}

}
