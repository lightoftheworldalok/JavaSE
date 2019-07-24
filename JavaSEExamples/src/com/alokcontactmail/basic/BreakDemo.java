package com.alokcontactmail.basic;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		num=100;
		// loop while i-squared is less than num
		for (int i = 0; i < num	; i++) {
			if(i*i >= num) {
				break; 
			}
			System.out.println(i+" ");
		}
		System.out.println("Loop completed. ");
	}
}
