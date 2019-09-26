package com.alokcontactmail.generics;

public class GenSimpleStack<T> implements IGenSimpleStack<T> {
	private T[] data; // this array holds the stack
	private int tos; // index of top of stack
	// Construct an empty stack with the given array as storage.
	public GenSimpleStack(T[] arrayRef) {
		data = arrayRef;
		tos = 0;
	}
	// Push an item into the stack.
	@Override
	public void push(T item) throws StackFullException {
		if(isFull())throw new StackFullException(data.length);
		
		data[tos] = item;
		tos++;
		
	}
	// Pop an item from the stack 
	@Override
	public T pop() throws StackEmptyException {
		if(isEmpty())throw new StackEmptyException();
		tos--;
		return data[tos];
	}
	// Return true if the stack is empty.
	@Override
	public boolean isEmpty() {
		return tos==0;
	}
	// Return true if the stack is full.
	@Override
	public boolean isFull() {
		return tos==data.length;
	}

}
