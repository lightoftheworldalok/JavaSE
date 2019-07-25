package com.alokcontactmail.moreDataTypeAndOperators;

public class ShowBitsDemo {

	public static void main(String[] args) {
		BitOut b = new BitOut(8);
		BitOut i = new BitOut(32);
		BitOut li = new BitOut(64);
		
		System.out.println("123 in binary: ");
		b.showBits(123);
		System.out.println("\n 87987 in binary: ");
		i.showBits(87987);
		System.out.println("\n 237658768 in binary: ");
		li.showBits(237658768);
		
		//you can also show low-order bits of any integer
		System.out.println("\n Low order 8 bits of 87987 in binary: ");
		b.showBits(87987);
	}

}
