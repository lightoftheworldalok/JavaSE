package com.alokcontactmail.moreDataTypeAndOperators;

public class ShowBitsInByte {

	public static void main(String[] args) {
		byte val;
		val = 123;
		for (int i = 128; i > 0; i= i/2){
			if((val & i)!= 0){
				System.out.println("1 ");
				System.out.println(" i : "+i);
				System.out.println(" val : "+val);
			}else {
				System.out.println("0 ");
				System.out.println(" i : "+i);
				System.out.println(" val : "+val);
			}
		}

	}

}
