package com.alokcontactmail.multithreasesprogramming;

public class MyThreadHavingSynchronizedBlockForMethod implements Runnable {
	Thread thread;
	static SumArray sa = new SumArray();
	int[] a;
	int answer;
	
	// Construct a new thread.
	public MyThreadHavingSynchronizedBlockForMethod(String name, int[] nums) {
		thread = new Thread(this,name);
		a = nums;
		thread.start();
	}
	@Override
	public void run() {
		System.out.println(thread.getName()+" starting ");
		synchronized (sa) {
			answer = sa.sumArray(a);
		}
		System.out.println("Sum for "+thread.getName()+" is "+answer);
		System.out.println(thread.getName()+" terminating. ");

	}

}
