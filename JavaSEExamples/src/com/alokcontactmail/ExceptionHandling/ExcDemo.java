/**
 * 
 */
package com.alokcontactmail.ExceptionHandling;

/**
 * @author alokkumar
 *
 */
public class ExcDemo {
	public static void main(String[] args) {
		int[] numer = {4,8,16,32,64,128};
		int[] demom = {2,0,4,4,0,8};
		
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i]+" / "+demom[i]+" is "+numer[i]/demom[i]);
			} catch (ArithmeticException e) {
				System.out.println("Can't divide by zero");
			}
		}

	}

}
