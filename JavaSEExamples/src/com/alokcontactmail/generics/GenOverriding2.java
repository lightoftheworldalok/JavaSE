package com.alokcontactmail.generics;

public class GenOverriding2<T> extends GenOverriding<T> {

	public GenOverriding2(T o) {
		super(o);
		// TODO Auto-generated constructor stub
	}
	// Override getOb()
	
	T getOb() {
		System.out.println("GenOverriding2 getOb");
		return ob;
	}
}
