package com.alokcontactmail.basic;

public class ContDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k;
		//System.out.println(k);
		outerloop: for(int i=1;i<10;i++){
		System.out.print("\n Outer loop pass "+i+" , Inner loop:");
		for (int j = 0; j < 10; j++) {
			if(j == 5) {
				continue outerloop;
			}
			System.out.print(j);
		}
	}
	}

}
