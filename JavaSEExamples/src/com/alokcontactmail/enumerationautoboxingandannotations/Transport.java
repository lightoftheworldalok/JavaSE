package com.alokcontactmail.enumerationautoboxingandannotations;

public enum Transport {
	CAR(65),TRUCK(55),AIRPLANE(600),TRAIN(70),BOAT(22); // Declare an enumeration.
	private int speed;
	// Constructor
	Transport(int s){
		speed = s;
	}
	int getSpeed() {
		return speed;
	}
}
