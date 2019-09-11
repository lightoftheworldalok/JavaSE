package com.alokcontactmail.generics;

public class TwoGen<T,V> {
	T ob1;
	V ob2;
	public TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	//Return ob 
	
	T getOb1() {
		return ob1;
	}
	
	V getOb2() {
		return ob2;
	}
	//show type of T
	
	void showType() {
		System.out.println("Type of T is "+ob1.getClass().getName());
		System.out.println("Type of T is "+ob2.getClass().getName());
	}
}
