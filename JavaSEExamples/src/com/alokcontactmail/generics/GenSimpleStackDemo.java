package com.alokcontactmail.generics;

public class GenSimpleStackDemo {

	public static void main(String[] args) {
		int i;
		Integer [] nums = new Integer[5];
		String [] strs = new String[3];
		
		// first create a stack for integers
		GenSimpleStack<Integer> intStack = new GenSimpleStack<Integer>(nums);
		System.out.println("Demonstrating Integer stack.");
		// use intStack
		try {
			System.out.println("Pushing: ");
			// push integers onto intStack
			for (int j = 0; !intStack.isFull(); j++) {
				System.out.print(j);
				intStack.push(j);
			}
			System.out.println();
			
			// pop integers off intStack
			System.out.println("Popping: ");
			while (!intStack.isEmpty()) {
				System.out.print(intStack.pop());
			}
			System.out.println();
		} catch (StackEmptyException e) {
			System.out.println(e);
		} catch (StackFullException e) {
			System.out.println(e);
		}
		
		// next, create a stack for strings
		
		GenSimpleStack<String> strStack = new GenSimpleStack<String>(strs);
		System.out.println("\n Demonstrating String stack.");
		// now, use strStack
		try {
			System.out.println("Pushing : alpha beta gamma ");
			
			// push strings onto strStack
			strStack.push("alpha");
			strStack.push("beta");
			strStack.push("gamma");
			
			// pop Strings off strStack
			System.out.println("Popping: ");
			while (!strStack.isEmpty()) {
				System.out.print(strStack.pop() +" ");
			}
		} catch (StackEmptyException e) {
			System.out.println(e);
		} catch (StackFullException e) {
			System.out.println(e);
		}
	}

}
