package com.alokcontactmail.packagesExample;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;
public class Quadratic {

	public static void main(String[] args) {
		// a,b,c represent the coefficients in the quadratic equation ax^2+bx+c=0
		double a,b,c,x;
		
		// Solve 4x^2+x-3 = 0 for x.
		
		a=4;
		b=1;
		c=-3;
		
		System.out.println("first solution ");
		x = (-b+sqrt(pow(b,2)-4*a*c)/(2*a));
		System.out.println("-->"+x);
		System.out.println("second solution ");
		x = (-b-sqrt(pow(b,2)-4*a*c)/(2*a));
		System.out.println("-->"+x);
		out.println("You are using static imports in this example ");
	}

}
