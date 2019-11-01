package com.alokcontactmail.javaUtil;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();
		double val;
		double sum = 0;
		int[] bell = new int[9];
		for (int i = 0; i < 100; i++) {
			val = r.nextGaussian();
			sum += val;
			double t = -2;
			for (int j = 0; j < bell.length; j++,t+= 0.5) {
				if (val <t) {
					bell[j]++;
					break;
				}
			}
		}
			System.out.println("Average of values: "+(sum/100));
			
			//display bell curve, sideways
			for (int j = 0; j < bell.length; j++) {
				for (int x = bell[j]; x >0; x--) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
