package com.alokcontactmail.MoreDataTypeAndOperators;

public class UpCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		for (int i = 0; i < 10; i++) {
			ch = (char) ('a'+i);
			System.out.print(ch);
			ch = (char)((int) ch & 65503);
			System.out.print(ch + " ");
		}
	}

}
