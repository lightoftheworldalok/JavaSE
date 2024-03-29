package com.alokcontactmail.generics;

public interface Containment<T> {
	// The contains() method tests if a
	// specific item is contained within 
	// an object that implements containment.
	boolean contains(T o);
	default void display() {
		System.out.println("Inside Containment default display method : ");
	}
	
	static void Show() {
		System.out.println("Inside Containment static Show method : ");
	}
}
