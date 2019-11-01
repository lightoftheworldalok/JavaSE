package com.alokcontactmail.javaUtil;

import java.util.Scanner;

public class AvgNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double sum = 0.0;
		System.out.println("Enter nember to average. ");
		
		// Read and sum numbers
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				sum += sc.nextDouble();
				count++;
			} else {
				String str = sc.next();
				if (str.equals("done")) {
					break;
				}else {
					System.out.println("Data format error");
					return;
				}
			}
		}
		System.out.println("Average is "+sum/count);
		sc.close();
	}

}
