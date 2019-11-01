package com.alokcontactmail.javaUtil;

public class TwoObservers {

	public static void main(String[] args) {
		BeingWatched observed = new BeingWatched();
		Watcher1 observing1 = new Watcher1();
		Watcher2 observing2 = new Watcher2();
		
		// add both observers to the observed object 
		
		observed.addObserver(observing1);
		observed.addObserver(observing2);
		
		observed.counter(5);
	}

}
