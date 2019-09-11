package com.alokcontactmail.generics;

public class Gen<T> {
	T ob;
	public Gen(T o) {
		ob =o;
	}
	
	//Return ob 
	
	T getOb() {
		return ob;
	}
	
	//show type of T
	
	void showType() {
		System.out.println("Type of T is "+ob.getClass().getName());
	}
}
