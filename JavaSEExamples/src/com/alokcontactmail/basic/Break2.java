package com.alokcontactmail.basic;

import java.io.IOException;

public class Break2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		for(;;) {
			ch=(char)System.in.read();
			if(ch == 'q')break;
		}
		System.out.println("you passed q!");
	}

}
