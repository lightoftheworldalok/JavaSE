package com.alokcontactmail.multithreasesprogramming;

public class MyThreadForWaitAndNotify implements Runnable {
	Thread thread;
	TickTock tickTockObj;
	// Construct a new thread.
	public MyThreadForWaitAndNotify(String name, TickTock tickTock) {
		thread = new Thread(this,name);
		tickTockObj = tickTock;
		thread.start(); //start the thread
	}
	// Begin execution of new thread. 
	@Override
	public void run() {
		if(thread.getName().compareTo("Tick")== 0) {
			for (int i = 0; i < 5; i++) {
				tickTockObj.tick(true);
			}
			tickTockObj.tock(false);
		}else {
			for (int i = 0; i < 5; i++) {
				tickTockObj.tock(true);
			}
			tickTockObj.tock(false);
		}

	}

}
