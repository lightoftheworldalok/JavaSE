package com.alokcontactmail.generics;

public class GenOverriding<T> {
	T ob;
	public GenOverriding(T o) {
		ob =o;
	}
	
	// Return ob
	T getOb() {
		return ob;
	}
}
