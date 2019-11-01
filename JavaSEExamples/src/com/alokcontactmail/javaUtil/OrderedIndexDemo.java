package com.alokcontactmail.javaUtil;

import java.util.Formatter;

public class OrderedIndexDemo {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		fmt.format("<<%3$d %1$d %2$d>>", 10,20,30);
		fmt.format("%d in hex is %1$x ", 255);
		System.out.println(fmt);
		fmt.format("%d in hex is %<x", 255);
		System.out.println(fmt);
		fmt.close();
	}

}
