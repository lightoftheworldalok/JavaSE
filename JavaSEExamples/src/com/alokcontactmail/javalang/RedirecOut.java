package com.alokcontactmail.javalang;

import java.io.IOException;
import java.io.PrintStream;

public class RedirecOut {

	public static void main(String[] args) {
		
		// first confirm that file has been specified.
		if (args.length != 1) {
			System.out.println("RedirectOut: to ");
			return;
		}
		// create a Printstream linked to the specified file.
		
		try (PrintStream fout = new PrintStream(args[0])){
			// save original System.out
			PrintStream orgOut = System.out;
			
			// redirect System.out to the file.
			System.setOut(fout);
			
			//notice that system.out is used here
			System.out.println("This goes in the file.");
			
			// restore original System.out
			System.setOut(orgOut);
			System.out.println("This is shown on the screen. ");
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
