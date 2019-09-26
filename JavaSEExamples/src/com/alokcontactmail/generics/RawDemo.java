package com.alokcontactmail.generics;

public class RawDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen<String> strOb = new Gen<String>("This is a string");
		// create a raw type gen object and assign it a double value
		
		Gen raw = new Gen(new Double(98.5));
		
		// cast here is necessary because type is unknown.
		double d = (Double) raw.getOb();
		System.out.println("Value: "+d);
		
		// The use of a raw type can lead to run-time exception Here are some of example
		
		// The following cast causes a run-time error!
		int i = (Integer)raw.getOb();// run time error
		
		// This assignment overrides type safty.
		strOb = raw;
		String str = strOb.getOb(); // run time error 
		
		// This assignment also overrides type safety.
		raw = iOb;
		d = (Double)raw.getOb();// run time error
		
	}

}
