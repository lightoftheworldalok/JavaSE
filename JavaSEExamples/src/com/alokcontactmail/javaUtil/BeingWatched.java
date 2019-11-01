package com.alokcontactmail.javaUtil;

import java.util.Observable;

public class BeingWatched extends Observable {
	// Just count down to zero Each count represents a change which the observers are notified.
	void counter(int count) {
		for (; count >= 0; count--) {
			setChanged(); // set state to changed.
			notifyObservers(count); // notify observers
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("Sleep interrupted ");
			}
		}
	}
}
