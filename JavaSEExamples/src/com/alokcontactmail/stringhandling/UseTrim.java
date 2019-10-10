package com.alokcontactmail.stringhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {

	public static void main(String[] args) {
		// Create a BufferedReader using System.in
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		System.out.println("Enter 'stop' to quit.");
		System.out.println("Enter State: ");
		do {
			try {
				str = br.readLine();
				str = str.trim();
				if(str.equals("Massouri"))
					System.out.println("Capital is Jefferson City. ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} while (!str.equals("stop"));

	}

}
