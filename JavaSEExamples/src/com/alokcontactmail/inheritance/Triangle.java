package com.alokcontactmail.inheritance;

public class Triangle extends TwoDShape {

	private String style;
	
	// A default constructor.
	
	public Triangle() {
		super(); // it must be the first statement executed.
		style = "none";
	}
	
	public Triangle(String s, double w,double h) {
		super(w,h);
		style = s;
	}
	
	//Constructor 
	public Triangle(double x) {
		super(x);
		style = "filled";
	}
	
	public Triangle(Triangle ob) {
		super(ob);
		style = ob.style;
	}
	
	public double area() {
		return getWidth()*getHeight()/2;
	}
	public void showStyle() {
		System.out.println("Triangle is "+style);
	}
}
