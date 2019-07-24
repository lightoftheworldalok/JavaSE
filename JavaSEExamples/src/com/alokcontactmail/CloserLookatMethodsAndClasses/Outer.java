package com.alokcontactmail.CloserLookatMethodsAndClasses;

public class Outer {
	int[] nums;
	
	public Outer(int[]n) {
		nums = n;
	}
	
	void analyze() {
		Inner inOb = new Inner();
		System.out.println("Minimun: "+inOb.min());
		System.out.println("Minimun: "+inOb.max());
		System.out.println("Minimun: "+inOb.avg());
	}
	
	class Inner{
		int min() {
			int m = nums[0];
			for (int i = 0; i < nums.length; i++) {
				if(nums[i] < m)m = nums[i];
			}
			return m;
		}
		
		int max() {
			int m = nums[0];
			for (int i = 0; i < nums.length; i++) {
				if(nums[i] > m)m = nums[i];
			}
			return m;
		}
		
		int avg() {
			int a = 0;
			for (int i = 0; i < nums.length; i++) {
				a += nums[i];
			}
			return a/nums.length;
		}
	}
}
