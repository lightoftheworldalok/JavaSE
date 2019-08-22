package com.alokcontactmail.enumerationautoboxingandannotations;

public class EnumDemo {

	public static void main(String[] args) {
		Transport tp;
		tp = Transport.AIRPLANE;
		
		// output an enum value.
		System.out.println("Value of tp: "+tp);
		System.out.println();
		tp = Transport.TRAIN;
		
		// compare two enum values.
		
		if(tp == Transport.TRAIN) {
			System.out.println("tp contains TRAIN");
		}
		// use an enum to control a switch statement.
		
		switch (tp) {
		case CAR:
			System.out.println("This is CAR");
			break;
		case TRUCK:
			System.out.println("This is TRUCK");
			break;
		case AIRPLANE:
			System.out.println("This is AIRPLANE");
			break;
		case TRAIN:
			System.out.println("This is TRAIN");
			break;
		case BOAT:
			System.out.println("This is BOAT");
			break;
		default:
			break;
		}

	}

}
