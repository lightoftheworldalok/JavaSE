package com.alokcontactmail.javaUtil;

import java.util.Formatter;

public class FormatDemoClosingFormatter {

	public static void main(String[] args) {
		try(Formatter fmt = new Formatter()) {
			fmt.format("Formatting %s is easy %d %f", "with Java",10,98.6);
			System.out.println(fmt);
		}

	}

}
