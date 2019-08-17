package com.alokcontactmail.multithreasesprogramming;

public class ThreadCom {

	public static void main(String[] args) {
		TickTock tt = new TickTock();
		MyThreadForWaitAndNotify m1 = new MyThreadForWaitAndNotify("Tick", tt);
		MyThreadForWaitAndNotify m2 = new MyThreadForWaitAndNotify("Tock", tt);
		try {
			m1.thread.join();
			m2.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
	}

}
