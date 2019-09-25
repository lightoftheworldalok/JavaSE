package com.alokcontactmail.generics;

public class GenericMethodDemo {
	
	// Determine if the contents of two arrays are the same 
	
	static <T, V extends T> boolean arrayEqual(T[] x , V[] y) {
		// if array length differ then the array differ.
		if(x.length != y.length)return false;
		for (int i = 0; i < x.length; i++) {
			if(!x[i].equals(y[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4,5,6};
		Integer[] nums2 = {1,2,3,4,5,6};
		if (arrayEqual(nums, nums2)) {
			System.out.println("nums are equals");
		}
	}

}
