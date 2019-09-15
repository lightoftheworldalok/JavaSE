package com.alokcontactmail.generics;

public class NumericFns<T extends Number> {
	T num;
	
	//pass the constructor a reference to a numeric object 
	public NumericFns(T n) {
		num = n;
	}
	
	double reciprocal() {
		return 1/num.doubleValue();
	}
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}
