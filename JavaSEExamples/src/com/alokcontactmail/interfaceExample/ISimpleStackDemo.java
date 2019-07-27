package com.alokcontactmail.interfaceExample;

public class ISimpleStackDemo {

	public static void main(String[] args) {
		ISimpleStack isFixedLengthStack = new FixedLengthStack(10);
		ISimpleStack isDynamicStack = new DynamicStack(5);
		
		// first, use fixedStack through isFixedLengthStack
		
		for (int i = 0; !isFixedLengthStack.isFull(); i++) {
			isFixedLengthStack.push((char)('A'+i));
		}
		
		//pop character off isFixedLengthStack
		System.out.print("Content of FixedStack: ");
		while (!isFixedLengthStack.isEmpty()) {
			char ch = isFixedLengthStack.pop();
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("Dynamic Stack: ");
		for (int i = 0; i < 26; i++) {
			isDynamicStack.push((char)('A'+i));
		}
		
		//pop character off isFixedLengthStack
		System.out.print("Content of FixedStack: ");
		while (!isDynamicStack.isEmpty()) {
			char ch = isDynamicStack.pop();
			System.out.print(ch+" ");
		}
		System.out.println();

	}

}
