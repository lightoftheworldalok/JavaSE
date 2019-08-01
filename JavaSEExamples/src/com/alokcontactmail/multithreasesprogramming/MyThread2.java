package com.alokcontactmail.multithreasesprogramming;

public class MyThread2 implements Runnable {
	Thread thread;
	// Construct a new thread.
	public MyThread2(String name) {
		thread = new Thread(this,name);
		thread.start(); // start the thread
	}
	// Begin execution of new thread. 
	@Override
	public void run() {
		System.out.println(thread.getName()+" stsrting. ");
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(400);
				System.out.println("In "+thread.getName()+", count is "+i);
			}
		} catch (InterruptedException e) {
			System.out.println(thread.getName()+" interrupted. ");
		}
		System.out.println(thread.getName()+" terminating. ");
	}

}
