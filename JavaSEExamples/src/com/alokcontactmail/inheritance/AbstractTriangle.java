package com.alokcontactmail.inheritance;

public class AbstractTriangle extends AbstractTwoDShape {
	private String style;
	
	// A default constructor.
	
	public AbstractTriangle() {
		super(); // it must be the first statement executed.
		style = "none";
	}
	
	public AbstractTriangle(String s, double w,double h) {
		super(w,h);
		style = s;
	}
	
	//Constructor 
	public AbstractTriangle(double x) {
		super(x);
		style = "filled";
	}
	
	public AbstractTriangle(AbstractTriangle ob) {
		super(ob);
		style = ob.style;
	}
	
	public void showStyle() {
		System.out.println("Triangle is "+style);
	}
	@Override
	double area() {
		return getWidth()*getHeight()/2;
	}

}
