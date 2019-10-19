package com.alokcontactmail.javalang;

import java.io.IOException;

public class PBDemo {

	public static void main(String[] args) {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("notepad","testfile");
			processBuilder.start(); // start the process
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error executing notepad.\n"+e);
			e.printStackTrace();
		}
		
	}

}
