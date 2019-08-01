package com.alokcontactmail.multithreasesprogramming;

public class UseThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		//First construct a MyThred object
		MyThread mt = new MyThread("Child #1");
		
		// net construct a thread object from that object 
		Thread newThread = new Thread(mt);
		
		// Finally, start execution of the thread.
		newThread.start();
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted. ");
			}
		}
		System.out.println("Main thread ending. ");
	}

}
