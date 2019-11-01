package com.alokcontactmail.javaUtil;

import java.util.Formatter;
import java.util.GregorianCalendar;

public class RelativeIndexDemo {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		GregorianCalendar calendar = new GregorianCalendar();
		fmt.format("Today is day %te of %<tB, %<tY", calendar);
		System.out.println(fmt);
		fmt.close();
	}

}
