package com.alokcontactmail.garbage;

public class MyClass {
	int x;
	public MyClass(int i) {
		x=i;
	}
	
	//Called when object is recycled
	protected void finalize() {
		System.out.println("Finalizing "+x);
	}
	
	//Generates an object that is immediately abandoned.
	
	void generate(int i) {
		MyClass o= new MyClass(i);
	}
}
