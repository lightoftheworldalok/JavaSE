package com.alokcontactmail.stringhandling;

public class ThreeStringRelatedLanguageFeatures {

	public static void main(String[] args) {
		// String literals
		String str = "this ia an example string literal";
		myMethod("a string literal");
		System.out.println(str);
		// String Concatenation with string and other data types
		int age = 19;
		String str1 = "he is "+age+" year old ";
		System.out.println(str1);

	}
	public static void myMethod(String arg){
		System.out.println(arg);
	}
}
