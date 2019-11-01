package com.alokcontactmail.javaUtil;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScanMixed {

	public static void main(String[] args) throws IOException {
		int i;
		double d;
		boolean b;
		String str;
		
		// Write output to a file 
		FileWriter fout = new FileWriter("Test.txt");
		fout.write("Testing sacnner 10 12.2 one true two false");
		fout.close();
		
		FileReader fin = new FileReader("Test.txt");
		try(Scanner sc = new Scanner(fin)){
			
			//Read to end.
			while (sc.hasNext()) {
				if (sc.hasNextInt()) {
					i = sc.nextInt();
					System.out.println("int: "+i);
				} else if(sc.hasNextDouble()) {
					d = sc.nextDouble();
					System.out.println("double: "+d);
				}else if(sc.hasNextBoolean()) {
					b = sc.nextBoolean();
					System.out.println("boolean: "+b);
				} else {
					str = sc.next();
					System.out.println("String: "+str);
				}
			}
		}
	}

}
