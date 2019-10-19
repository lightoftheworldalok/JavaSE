package com.alokcontactmail.javalang;

import java.io.IOException;

public class PBDemo3 {

	public static void main(String[] args) {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("notepad","testfile");
			Process p  = processBuilder.start(); // start the process
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted \n "+e);
			}
			
			// terminate the process
			
			p.destroy();// terminating the process
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error executing notepad.\n"+e);
			e.printStackTrace();
		}
	}

}
