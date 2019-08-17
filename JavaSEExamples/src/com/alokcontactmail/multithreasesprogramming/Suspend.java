package com.alokcontactmail.multithreasesprogramming;

public class Suspend {

	public static void main(String[] args) {
		MyThreadSuspendingResumingStoping ob1 = new MyThreadSuspendingResumingStoping("My Thread");
		
		try {
			Thread.sleep(1000);
			
			ob1.mySuspend();
			System.out.println("Suspending thread. ");
			Thread.sleep(1000);
			
			ob1.myResume();
			System.out.println("Resuming thread. ");
			Thread.sleep(1000);
			
			ob1.mySuspend();
			System.out.println("Suspending thread. ");
			Thread.sleep(1000);
			
			ob1.myResume();
			System.out.println("Resuming thread. ");
			Thread.sleep(1000);
			
			ob1.mySuspend();
			System.out.println("Suspending thread. ");
			ob1.myStop();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted. ");
		}
		
		// wait for thread to finish
		try {
			ob1.thrd.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted. ");
		}
		System.out.println("Main thread exiting. ");
	}

}
