package com.alokcontactmail.inheritance;

public abstract class AbstractTwoDShape {
	private double width;
	private double height;
	private String name;
	
	// A default constructor.
	public AbstractTwoDShape() {
		width=height=0.0;
	}
	
	//Parameterized constructor.
	public AbstractTwoDShape(double w, double h) {
		
	}
	
	public AbstractTwoDShape(double x, String n) {
		width= height =x;
		name = n;
		
	}
	public AbstractTwoDShape(double w, double h, String n) {
		name=n;
		width = w;
		height = h;
	}
	public AbstractTwoDShape(AbstractTwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	// Constructor with equal height and width 
	public AbstractTwoDShape(double x) {
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
	abstract double area();
}
