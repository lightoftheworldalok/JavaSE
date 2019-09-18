package com.alokcontactmail.generics;

public class NumericFnsWildcard<T extends Number> {
	T num;
	
	//pass the constructor a reference to a numeric object 
	public NumericFnsWildcard(T n) {
		num = n;
	}
	
	double reciprocal() {
		return 1/num.doubleValue();
	}
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	
	// Determine if the absolute value of two object are same 
	
	boolean absEqual(NumericFnsWildcard<?> ob) {
		if(Math.abs(this.num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
			return true;
		}
		return false;
	}
}
