/**
 * 
 */
package com.alokcontactmail.interfaceExample;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author alokkumar
 *
 */
public class DynamicStack implements ISimpleStack {
	private char[] data;
	private int tos;
	
	public DynamicStack(int size) {
		data = new char[size];
		tos = 0; // create the array to hold the stack 
	}
	
	// Construct a stack form a stack
	public DynamicStack(DynamicStack dynamicStack) {
		// size of new stack equals that of otherStack 
		this.data = new char[dynamicStack.data.length];
		
		// set tos to the same position 
		this.tos = dynamicStack.tos;
		
		// copy the contents
		for (int i = 0; i < tos; i++) {
			this.data[i] = dynamicStack.data[i];
		}
	}
	
	// Construct a stack with initial values.
	public DynamicStack(char [] chrs) {
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
		// if there is no more room in the array expand the size of the stack 
		System.out.println("tos "+tos+"data.length"+data.length);
		if(tos == data.length) {
			// double the size of the existing array
			char[] t = new char[data.length*2];
			// copy the contents of the stack into the large array 
			for(int i = 0; i < tos;i++) {
				t[i] = data[i];
			}
			data = t;
		}
		data[tos] = ch;
		tos++;

	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println(" --- Stack is Empty. ");
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
		return false;
	}

}
