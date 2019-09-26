package com.alokcontactmail.generics;

public class StackFullException extends Exception {
	int size;
	public StackFullException(int s) {
		super("Stack full");
		size = s;
	}
	
	public String toString() {
		return "\n Stack is full. Maximum size is "+size;
	}
}
