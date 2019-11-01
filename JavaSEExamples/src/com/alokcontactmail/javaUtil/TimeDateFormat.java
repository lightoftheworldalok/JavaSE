package com.alokcontactmail.javaUtil;

import java.util.Formatter;
import java.util.GregorianCalendar;

public class TimeDateFormat {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		GregorianCalendar calendar = new GregorianCalendar();
		// Standard 12 hrs time format 
		fmt.format("%tr \n", calendar);
		// complete date and time information 
		fmt.format("%tc\n", calendar);
		// just hour and minute
		fmt.format("%tl: %tM \n", calendar,calendar);
		// month by name and number
		fmt.format("%tB %tb %tm", calendar,calendar,calendar);
		
		// display the formats 
		System.out.println(fmt);
		fmt.close();

	}

}
