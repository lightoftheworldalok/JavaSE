package com.alokcontactmail.moreDataTypeAndOperators;

public class SimpleCipher {

	public static void main(String[] args) {
		String msg = "This is a test";
		String encMsg = "";
		String decMsg = "";
		int key = 88;
		System.out.println("Original message: "+msg);
		
		//encode the message
		for (int i = 0; i < msg.length(); i++) {
			encMsg = encMsg + (char) (msg.charAt(i)^key);
		}
		System.out.println("Encoded message: "+encMsg);
		
		//decode the message
		for (int i = 0; i < msg.length(); i++) {
			decMsg = decMsg + (char) (encMsg.charAt(i)^key);
		}
		System.out.println("Decoded message: "+decMsg);
	}
}
