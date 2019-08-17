package com.alokcontactmail.multithreasesprogramming;

public class MyThreadSuspendingResumingStoping implements Runnable {
	Thread thrd;
	boolean suspended;
	boolean stopped;
	
	public MyThreadSuspendingResumingStoping(String name) {
		thrd = new Thread(this,name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	
	@Override
	public void run() {
		System.out.println(thrd.getName()+" starting. ");
		try {
			for(int i=1; i<1000; i++) {
				System.out.print(i+" ");
				if((i%10)== 0) {
					System.out.println();
					Thread.sleep(250);
				}
				// Use synchronized block to check suspended and stopped.
				synchronized (this) {
					while (suspended) {
						wait();
					}
					if (stopped) {
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(thrd.getName()+" exiting.");
		}
	}
	
	// Stop the thread
	synchronized void myStop() {
		stopped = true;

		// The following ensures that a suspended thread can be stopped.
		suspended = false;
		notify();
	}
	// Suspend the thread
	synchronized void mySuspend() {
		suspended = true;
	}
	// Resume the thread
	synchronized void myResume() {
		suspended = false;
		notify();
	}

}
