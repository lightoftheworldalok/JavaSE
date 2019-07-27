package com.alokcontactmail.inheritance;

public class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	// A default constructor.
	public TwoDShape() {
		width=height=0.0;
	}
	
	//Parameterized constructor.
	public TwoDShape(double w, double h) {
		
	}
	
	public TwoDShape(double x, String n) {
		width= height =x;
		name = n;
		
	}
	public TwoDShape(double w, double h, String n) {
		name=n;
		width = w;
		height = h;
	}
	public TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	// Constructor with equal height and width 
	public TwoDShape(double x) {
		width=height=x;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public void showDim() {
		System.out.println("Width and Heigth are "+width+" and "+height);
	}
	public String getName() {
		 return this.name;
	}
	public double area() {
		System.out.println("area () must be overridden");
		return 0.0;
	}
}
