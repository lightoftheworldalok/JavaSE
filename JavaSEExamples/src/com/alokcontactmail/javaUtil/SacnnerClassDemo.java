package com.alokcontactmail.javaUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SacnnerClassDemo {
	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("testfile.txt");
		Scanner sc = new Scanner(fin);
		System.out.println(sc.next());
	}
}
