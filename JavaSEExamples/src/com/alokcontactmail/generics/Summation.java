package com.alokcontactmail.generics;

public class Summation {
	private int sum;
	public <T extends Number>Summation(T args) {
		sum = 0;
		for (int i = 0; i < args.intValue(); i++) {
			sum += i;
		}
	}
	int getSum() {
		return sum;
	}
}
