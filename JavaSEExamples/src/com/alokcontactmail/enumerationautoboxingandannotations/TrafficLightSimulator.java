package com.alokcontactmail.enumerationautoboxingandannotations;

public class TrafficLightSimulator implements Runnable {
	private Thread thrd; //holds the thread that runs the simulation
	private TrafficLightColor tlc; // holds the current color
	boolean stop = false; // set to true to stop the simulation
	boolean change = false; // true when the light has changed
	public TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		thrd = new Thread(this);
		thrd.start();
	}
	public TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		thrd = new Thread(this);
		thrd.start();
	}
	@Override
	public void run() {
		while(!stop) {
			try {
				switch (tlc) {
				case GREEN:
					Thread.sleep(10000); // green for 10 second
					break;
				case YELLOW:
					Thread.sleep(2000); // YELLOW for 2 second
					break;
				case RED:
					Thread.sleep(12000); // RED for 12 second
					break;
				}
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			changeColor();
		}

	}
	private synchronized void changeColor() {
		switch (tlc) {
		case YELLOW:
			tlc = TrafficLightColor.RED; 
			break;
		case RED:
			tlc = TrafficLightColor.GREEN; 
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
		}
		change = true;
		notify(); // signal that the light has changed
	}
	// wait until a light change occurs
	synchronized void waitForChange() {
		try {
			while (!change) {
				wait(); // wait for light to change
				change = false;
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	//Return current color
	synchronized TrafficLightColor getColor() {
		return tlc;
	}
	// stop the traffic light 
	synchronized void cancle() {
		stop = true;
	}
}
