package com.alokcontactmail.ExceptionHandling;

public class CustomExceptDemo {

	public static void main(String[] args) {
		int[] numer = {4,8,15,32,64,127,256,512};
		int[] denom = {2,0,4,4,0,8};
		for (int i = 0; i < numer.length; i++) {
			try {
				if(numer[i]%denom[i] !=0) throw new NonIntResultException(numer[i], denom[i]);
				System.out.println(numer[i]+" / "+denom[i]+" is "+numer[i]/denom[i]);
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				if (e instanceof ArithmeticException) {
					System.out.println("Can't divide by zero! ");
				} else if(e instanceof ArrayIndexOutOfBoundsException) {
					System.out.println("No maatching element found. ");
				}else {
					System.out.println("Exception occured");
				}
			} catch (NonIntResultException e) {
				System.out.println(e);
			}
		}
	}
}
