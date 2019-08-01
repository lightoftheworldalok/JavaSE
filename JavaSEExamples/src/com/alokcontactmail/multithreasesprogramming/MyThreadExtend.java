package com.alokcontactmail.multithreasesprogramming;

public class MyThreadExtend extends Thread{
	public MyThreadExtend(String name) {
		super(name);
		start();
	}
	
	// Begin execution of new thread 
	public void run() {
		System.out.println(getName()+" stsrting. ");
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(400);
				System.out.println("In "+getName()+", count is "+i);
			}
		} catch (InterruptedException e) {
			System.out.println(getName()+" interrupted. ");
		}
		System.out.println(getName()+" terminating. ");
	}
}
