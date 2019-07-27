package com.alokcontactmail.inheritance;

public class AbstractRectangle extends AbstractTwoDShape {
	public AbstractRectangle() {
		super();
	}
	AbstractRectangle(double w, double h){
		super(w, h,"rectangle");
	}
	public AbstractRectangle(double x) {
		super(x,"rectangle");
	}
	public AbstractRectangle(AbstractRectangle ob) {
		super(ob);
	}
	public boolean isSquare() {
		if(this.getWidth() == this.getHeight()) {
			return true;
		}
		return false;
	}
	@Override
	double area() {
		return this.getWidth()*this.getHeight();
	}

}
