package com.alokcontactmail.generics;

public class StackEmptyException extends Exception {

	
	public StackEmptyException() {
		super("Stack is Empty");
	}
	
	public String toString() {
		return "\n Stack is empty ";
	}
}
