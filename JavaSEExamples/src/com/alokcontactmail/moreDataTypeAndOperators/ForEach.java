package com.alokcontactmail.moreDataTypeAndOperators;

public class ForEach {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		int [][] multiNums = new int[3][5];
		int sumOfMultiNums = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				multiNums[i][j] = (i+1)*(j+1);
			}
		}
		int sum = 0;
		// use for-each style for to display and sum the values.
		for(int x: nums) {
			System.out.println("Value is : "+x);
			sum +=x;
		}
		
		for(int[]x: multiNums) {
			for(int y: x) {
				System.out.println("Value is: "+y);
				sumOfMultiNums += y;
			}
		}
		System.out.println("Summation: "+sum);
		System.out.println("Summation: "+sumOfMultiNums);
	}
}
