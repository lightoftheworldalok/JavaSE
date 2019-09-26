package com.alokcontactmail.generics;

public class Generic<T> {
	T ob;
	public Generic(T o) {
		ob =o;
	}
	
	// Return ob
	T getOb() {
		return ob;
	}
}
