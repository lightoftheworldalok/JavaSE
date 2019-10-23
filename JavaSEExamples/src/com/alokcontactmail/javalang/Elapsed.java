package com.alokcontactmail.javalang;

public class Elapsed {

	public static void main(String[] args) {
		long start, end;
		System.out.println("Timing a for loop 0 to 100,000,000");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++);
		end = System.currentTimeMillis();
		System.out.println("Elapsed time : "+(end-start));
		
		System.out.println("Use of nanoTime()===============================");
		start = System.nanoTime();
		for (int i = 0; i < 100000000; i++);
		end = System.nanoTime();
		System.out.println("Elapsed time : "+(end-start));
		
	}

}
