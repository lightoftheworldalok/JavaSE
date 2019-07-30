package com.alokcontactmail.ExceptionHandling;

public class UseFinally {
	public static void genException(int what) {
		int t;
		int[] nums = new int[2];
		System.out.println("Receiving : "+what);
		try {
			switch (what) {
			case 0:
				t=10/what;
				break;
			case 1:
				nums[4]=4;
				break;
			case 2:
				return;
			default:
				break;
			}
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("Can't divide by zero! ");
				return;
			} else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("No maatching element found. ");
			}else {
				System.out.println("Exception occured");
			}
		} finally {
			System.out.println("Leaving try. ");
		}
	}
}
