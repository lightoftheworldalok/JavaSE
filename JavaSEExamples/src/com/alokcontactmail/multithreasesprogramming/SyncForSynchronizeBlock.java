package com.alokcontactmail.multithreasesprogramming;

public class SyncForSynchronizeBlock {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		MySyncThread mt1 = new MySyncThread("Child #1", a);
		MySyncThread mt2 = new MySyncThread("Child #2", a);
		
		try {
			mt1.thread.join();
			mt2.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
	}

}
