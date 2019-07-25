package com.alokcontactmail.closerLookatMethodsAndClasses;

public class VarArgs3 {
	
	static void vaTest(int ...is) {
		System.out.println("vaTest(int ...is): "+"Number of args: "+is.length);
		System.out.println("Contents: ");
		for (int i = 0; i < is.length; i++) {
			System.out.println(" arg "+i+": "+is[i]);
		}
		System.out.println();
	}
	static void vaTest(boolean ...is) {
		System.out.println("vaTest(boolean ...is): "+"Number of args: "+is.length);
		System.out.println("Contents: ");
		for (int i = 0; i < is.length; i++) {
			System.out.println(" arg "+i+": "+is[i]);
		}
		System.out.println();
	}
	static void vaTest(String msg,int ...is) {
		System.out.println("vaTest(String msg,int ...is): "+"Number of args: "+is.length+" msg : "+msg);
		System.out.println("Contents: ");
		for (int i = 0; i < is.length; i++) {
			System.out.println(" arg "+i+": "+is[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(1,2,3);
		vaTest("Testing: ",10,20);
		vaTest(true,false,true);
		// vaTest(); Error Ambiguous!
		
	}

}
