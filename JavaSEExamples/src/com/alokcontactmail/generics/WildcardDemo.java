package com.alokcontactmail.generics;

public class WildcardDemo {

	public static void main(String[] args) {
		NumericFnsWildcard<Integer> iOb = new NumericFnsWildcard<Integer>(6);
		NumericFnsWildcard<Double> dOb = new NumericFnsWildcard<Double>(-6.0);
		NumericFnsWildcard<Long> lOb = new NumericFnsWildcard<Long>(5L);
		System.out.println("Testing iOb and dOb. ");
		if(iOb.absEqual(dOb)) {
			System.out.println("Absolute values are equal. ");
		}else {
			System.out.println("Absolute values are differ. ");
		}
		System.out.println();
		
		System.out.println("Testing iOb and lOb. ");
		if(iOb.absEqual(lOb)) {
			System.out.println("Absolute values are equal. ");
		}else {
			System.out.println("Absolute values are differ. ");
		}
	}

}
