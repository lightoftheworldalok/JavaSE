package com.alokcontactmail.generics;

public class BoundsDemo {

	public static void main(String[] args) {
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);
		System.out.println("Reciprocal of iOb is "+iOb.reciprocal());
		System.out.println("Fractional component of iOb is "+iOb.fraction());
		System.out.println();
		NumericFns<Double> dOb = new NumericFns<Double>(5.025);
		System.out.println("Reciprocal of iOb is "+dOb.reciprocal());
		System.out.println("Fractional component of iOb is "+dOb.fraction());
	}

}
