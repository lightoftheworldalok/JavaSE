package com.alockcontactmail.basic;

public class Break3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println("outer loop count : "+i);
			System.out.print(" Inner loop count : ");
			int t =0;
			while(t<100) {
				if(t== 10)break;
				System.out.print(t+" ");
			}
			System.out.println();
		}
		System.out.println("Loops completed. ");
	}

}
