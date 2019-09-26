package com.alokcontactmail.generics;

public interface IGenSimpleStack<T> {
	// push an item into the stack.
	void push(T item)throws StackFullException;
	
	// pop an items from the stack.
	T pop()throws StackEmptyException;
	
	// Return true if the stack is empty.
	boolean isEmpty();
	
	// Return true if the stack is full.
	boolean isFull();
}
