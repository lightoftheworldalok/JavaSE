package com.alokcontactmail.inheritance;

public class AbsShape {

	public static void main(String[] args) {
		TwoDShape[] shapes = new TwoDShape[5];
		
		shapes[0] = new Triangle("outlined",8.0,12.0);
		shapes[1] = new Triangle(7.0);
		shapes[2] = new Rectangle(10,4);
		shapes[3] = new Rectangle(10);
		shapes[4] = new TwoDShape(10,20,"generic");
		
		for(TwoDShape shape: shapes) {
			System.out.println("Object is "+shape.getName());
			System.out.println("Object is "+shape.area());
			System.out.println();
		}

	}

}
