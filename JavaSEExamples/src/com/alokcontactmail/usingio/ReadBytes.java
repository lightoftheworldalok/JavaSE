package com.alokcontactmail.usingio;

import java.io.IOException;

public class ReadBytes {

	public static void main(String[] args) throws IOException{
		byte[] data = new byte[10];
		System.out.print("Enter some character");
		int numRead = System.in.read(data);
		System.out.println("numRead: "+numRead);
		System.out.print("you have entered : ");
		for (int i = 0; i < numRead; i++) {
			System.out.print((char) data[i]);
		}

	}

}
