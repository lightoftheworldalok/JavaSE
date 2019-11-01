package com.alokcontactmail.javaUtil;

import java.util.Formatter;

public class FieldWidthDemo {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		fmt.format("|%f|\n|%12f|\n", 10.12345,10.12345);
		fmt.format("|%s|\n|%10s|\n", "Java","JAVA");
		System.out.println(fmt);
		fmt.close();
	}

}
