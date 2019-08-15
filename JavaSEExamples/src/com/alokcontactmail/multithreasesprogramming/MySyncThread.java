package com.alokcontactmail.multithreasesprogramming;

public class MySyncThread implements Runnable {
	Thread thread;
	static SumArray sa = new SumArray();
	int[] a;
	int answer;
	
	// Construct a new thread.
	public MySyncThread(String name, int[] nums) {
		thread = new Thread(this,name);
		a = nums;
		thread.start();
	}
	@Override
	public void run() {
		System.out.println(thread.getName()+" starting ");
		answer = sa.sumArray(a);
		System.out.println("Sum for "+thread.getName()+" is "+answer);
		System.out.println(thread.getName()+" terminating. ");

	}

}
