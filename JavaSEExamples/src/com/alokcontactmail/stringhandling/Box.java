package com.alokcontactmail.stringhandling;

public class Box {
	double width;
	double heigth;
	double depth;
	public Box(double width, double heigth, double depth) {
		super();
		this.width = width;
		this.heigth = heigth;
		this.depth = depth;
	}
	// Provide string representation of box
	@Override
	public String toString() {
		return "Dimentions are "+width+" by "+depth+" by "+heigth+".";
	}
}
