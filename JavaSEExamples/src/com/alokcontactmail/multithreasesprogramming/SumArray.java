package com.alokcontactmail.multithreasesprogramming;

public class SumArray {
	private int sum;
	synchronized int sumArray(int[] nums) {
		sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Running total for "+Thread.currentThread().getName()+" is "+sum);
			try {
				Thread.sleep(100);// allow task-switch
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted. ");
			}
		}
		return sum;
	}
}
