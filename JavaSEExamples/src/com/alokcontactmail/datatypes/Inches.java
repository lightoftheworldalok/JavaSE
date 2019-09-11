package com.alokcontactmail.datatypes;
import java.lang.*;
/**
 * 
 */

/**
 * @author alokkumar
 * integer types byte short int and long char
 */
public class Inches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long cubicInches;
		long inchesPerMile;
		char ch = 200;
		double od = '5';
		System.out.println(ch);
		System.out.println(od);
		//compute the number of inches in a mile
		inchesPerMile = 5280 *12;
		
		//compute the number of cubic inches
		cubicInches = inchesPerMile * inchesPerMile * inchesPerMile;
		System.out.println("There are "+cubicInches+" cubic inches in a cubic mile.");

	}

}
