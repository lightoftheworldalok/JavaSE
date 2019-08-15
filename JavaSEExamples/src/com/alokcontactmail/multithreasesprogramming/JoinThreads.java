package com.alokcontactmail.multithreasesprogramming;

public class JoinThreads {
	public static void main(String[] args) {
		System.out.println("Main thread starting. ");
		MyThread2 mt1 = new MyThread2("Child #1");
		MyThread2 mt2 = new MyThread2("Child #2");
		MyThread2 mt3 = new MyThread2("Child #3");
			try {
				mt1.thread.join();
				System.out.println("Child #1 joined.");
				mt2.thread.join();
				System.out.println("Child #2 joined.");
				mt3.thread.join();
				System.out.println("Child #3 joined.");
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted. ");
			}
		System.out.println("Main thread ending. ");
	}
}
