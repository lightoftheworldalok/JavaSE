/**
 * 
 */
package com.alokcontactmail.MoreDataTypeAndOperators;

/**
 * @author alokkumar
 *
 */
public class BitOut {
	int numBits;
	
	public BitOut(int n) {
		if(n < 1) n = 1;
		if(n > 64)n = 64;
		numBits = n;
	}
	
	//Display the sequence of bits.
	void showBits(long val) {
		long mask = 1;
		
		// left- shift a 1 into the proper position
		mask <<= numBits-1;
		
		int spacer = 8 - (numBits % 8);
		for (; mask != 0; mask >>>=1) {
			if((val & mask)!=0)System.out.print("1");
			else System.out.print("0");
			
			spacer++;
			
			if((spacer % 8) ==0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
}
