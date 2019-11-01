package com.alokcontactmail.javaUtil;

import java.util.Formatter;
import java.util.Locale;

public class LocaleFormat {

	public static void main(String[] args) {
		Formatter usFmt = new Formatter(Locale.US);
		Formatter gerFmt = new Formatter(Locale.GERMAN);
		double n = 12345678.24;
		usFmt.format("English: %,.2f", n);
		System.out.println(usFmt);
		usFmt.close();
		
		gerFmt.format("German: %,.2f", n);
		System.out.println(gerFmt);
		gerFmt.close();
	}

}
