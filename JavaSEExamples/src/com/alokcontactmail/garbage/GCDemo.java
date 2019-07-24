package com.alokcontactmail.garbage;

public class GCDemo {

	public static void main(String[] args) {
		MyClass ob = new MyClass(0);
		for (int i = 1; i < 10000000; i++) {
			ob.generate(i);
		}
		
	}

}
