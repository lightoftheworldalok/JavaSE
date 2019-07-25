package com.alokcontactmail.closerLookatMethodsAndClasses;

public class VaArgs {
	static void vaTest(int ...is ) {
		System.out.println("Number of argument: "+is.length);
		System.out.println("Contents: ");
		for (int i = 0; i < is.length; i++) {
			System.out.println(" arg "+i+" : "+is[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1,2,3);
		vaTest();

	}

}
