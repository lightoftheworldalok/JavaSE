package com.alokcontactmail.javalang;

import java.io.IOException;

public class PBDemo2 {

	public static void main(String[] args) {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("notepad","testfile");
			Process p = processBuilder.start(); // start the process
			p.waitFor();
			System.out.println("Notepad returned "+p.exitValue());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error executing notepad.\n"+e);
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Wait interrupted \n "+e);
			e.printStackTrace();
		}
	}

}
