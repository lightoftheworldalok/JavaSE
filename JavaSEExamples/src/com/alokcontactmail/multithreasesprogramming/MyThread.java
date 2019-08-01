package com.alokcontactmail.multithreasesprogramming;

public class MyThread implements Runnable {

	String thrdName;
	public MyThread(String name) {
		thrdName = name;
	}
	@Override
	public void run() {
		System.out.println(thrdName+" starting. ");
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(400);
				System.out.println("In "+thrdName+", count is "+i);
			}
		} catch (InterruptedException e) {
			System.out.println(thrdName+" interrupted. ");
		}
		System.out.println(thrdName+" terminating. ");
	}

}
