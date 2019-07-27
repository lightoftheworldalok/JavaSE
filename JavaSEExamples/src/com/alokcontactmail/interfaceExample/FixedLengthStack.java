package com.alokcontactmail.interfaceExample;

public class FixedLengthStack implements ISimpleStack {
	private char[] data;
	private int tos;
	
	// Construct an empty stack given its size
	public FixedLengthStack(int size) {
		data = new char[size];
		tos = 0; // create the array to hold the stack 
	}
	
	// Construct a stack form a stack
	public FixedLengthStack(FixedLengthStack fixedLengthStack) {
		// size of new stack equals that of otherStack 
		this.data = new char[fixedLengthStack.data.length];
		
		// set tos to the same position 
		this.tos = fixedLengthStack.tos;
		
		// copy the contents
		for (int i = 0; i < tos; i++) {
			this.data[i] = fixedLengthStack.data[i];
		}
	}
	
	// Construct a stack with initial values.
	public FixedLengthStack(char [] chrs) {
		// Create the array to hold the initial values
		data = new char[chrs.length];
		tos = 0;
		
		// initialized the stack by pushing the contents of chrs onto it
		for(char ch:chrs) {
			push(ch);
		}
	}
	
	@Override
	public void push(char ch) {
		if(isFull()) {
			System.out.println("---- Stack is full.");
			return;
		}
		data[tos]=ch;
		tos++;
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println(" --- Stack is empty. ");
			return (char)0;
		}
		tos--;
		return data[tos];
	}

	@Override
	public boolean isEmpty() {
		return tos == 0;
	}

	@Override
	public boolean isFull() {
		return tos == data.length;
	}

}
