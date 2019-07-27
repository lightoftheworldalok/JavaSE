package com.alokcontactmail.inheritance;

public class Rectangle extends TwoDShape {
	public Rectangle() {
		super();
	}
	Rectangle(double w, double h){
		super(w, h,"rectangle");
	}
	public Rectangle(double x) {
		super(x,"rectangle");
	}
	public Rectangle(Rectangle ob) {
		super(ob);
	}
	public boolean isSquare() {
		if(this.getWidth() == this.getHeight()) {
			return true;
		}
		return false;
	}
	public double area() {
		return this.getWidth()*this.getHeight();
	}
}
