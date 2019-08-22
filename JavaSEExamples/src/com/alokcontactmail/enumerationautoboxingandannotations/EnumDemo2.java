package com.alokcontactmail.enumerationautoboxingandannotations;

public class EnumDemo2 {

	public static void main(String[] args) {
		Transport tp,tp2,tp3;
		System.out.println("Here are all Transport constants");
		System.out.println("Typical speed of an airplane is "+Transport.AIRPLANE.getSpeed());
		// Use values()
		Transport[] allTransports = Transport.values();
		for(Transport t : allTransports) {
			System.out.print(t+" speed is ");
			System.out.println(t.getSpeed());
			System.out.println(t + " ordinal vale is : "+t.ordinal());
		}
		System.out.println();
		
		// use valueOf()
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp contain "+tp);
		tp = Transport.AIRPLANE;
		tp2 = Transport.TRAIN;
		tp3 = Transport.AIRPLANE;
		
		if(tp.compareTo(tp2)<0) {
			System.out.println(tp+" comes before "+tp2);
		}if(tp.compareTo(tp2)>0) {
			System.out.println(tp2+" comes before "+tp);
		}if(tp.compareTo(tp3)== 0) {
			System.out.println(tp+" equals "+tp3);
		}
	}

}
