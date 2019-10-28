package com.alokcontactmail.javaUtil;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarDemo {

	public static void main(String[] args) {
		// Create a calendar initialized with the current date and time.
		GregorianCalendar calendar = new GregorianCalendar();
		
		// Display current date and time information 
		System.out.println("Date : ");
		System.out.print(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())+" ");
		System.out.print(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
		// System.out.println(calendar.getDisplayName(Calendar.YEAR, Calendar.LONG, Locale.getDefault()));
		
		System.out.print(" "+calendar.get(Calendar.DATE)+", ");
		System.out.println(calendar.get(Calendar.YEAR));
		
		System.out.println("Time : ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.print(calendar.get(Calendar.SECOND));
		
		// determine AM or PM
		int am = calendar.get(Calendar.AM_PM);
		if (am == Calendar.AM) {
			System.out.println(" AM");
		} else {
			System.out.println(" PM");
		}
		
		//get the current year
		int year = calendar.get(Calendar.YEAR);
		System.out.print(year+" is a ");
		if (calendar.isLeapYear(year)) {
			System.out.println(" laep year ");
		} else {
			System.out.println(" not a leap year ");
		}
		//set the time information and display it.
		calendar.set(Calendar.HOUR, 10);
		calendar.set(Calendar.AM_PM, Calendar.PM);
		calendar.set(Calendar.MINUTE, 29);
		calendar.set(Calendar.SECOND, 22);
		calendar.set(Calendar.YEAR, 2025);
		System.out.println("Updated time: ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+":");
		System.out.print(calendar.get(Calendar.SECOND));
		am = calendar.get(Calendar.AM_PM);
		if (am == Calendar.AM) {
			System.out.println(" AM");
		} else {
			System.out.println(" PM");
		}
		
		GregorianCalendar myCalenderA = new GregorianCalendar(2025,0,1);
		GregorianCalendar myCalenderB = new GregorianCalendar(2025,0,2);
		System.out.println("myCalenderA.before(myCalenderB) : "+myCalenderA.before(myCalenderB));
		System.out.println("myCalenderA.before(myCalenderB) : "+myCalenderA.after(myCalenderB));
		
		myCalenderA.add(Calendar.MONTH, 3);
		System.out.println("myCalenderA : "+myCalenderA.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
	}

}
