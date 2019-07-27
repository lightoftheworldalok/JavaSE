package com.alokcontactmail.inheritance;

public class FinalD {

	public static void main(String[] args) {
		ErrorMsg msg = new ErrorMsg();
		
		System.out.println(msg.getErrorMsg(msg.OUTERR));
		System.out.println(msg.getErrorMsg(msg.DISKERR));

	}

}
