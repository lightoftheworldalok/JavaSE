package com.alokcontactmail.stringhandling;

public class OverrideToString {

	public static void main(String[] args) {
		Box b = new Box(10, 12, 14);
		String str = "Box b: "+b;
		System.out.println(b);
		System.out.println(str);
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		// lenght()
		System.out.println("Length of str is : "+str.length());
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		// charAt
		for (int i = 0; i < str.length(); i++) {
			System.out.print("Example of charAt"+i+" "+str.charAt(i)+" ");
		}
		String str1 = "Programming is both art and science";
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		// getChars()
		int start = 15;
		int end = 23;
		char[] buf = new char[end-start];
		str1.getChars(start, end, buf, 0);
		System.out.println(buf);
		
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		// toCharArray()
		char[] chrs = str1.toCharArray();
		System.out.println(chrs);
		
		// equals() and equalsIgnoreCase()
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		String string1 = "table";
		String string2 = "table";
		String string3 = "chair";
		String string4 = "TABLE";
		
		if (string1.equals(string2)) {
			System.out.println(string1+" equals "+string2);
		}else {
			System.out.println(string1+" does not equals "+string2);
		}
		if (string1.equals(string3)) {
			System.out.println(string1+" equals "+string3);
		}else {
			System.out.println(string1+" does not equals "+string3);
		}
		if (string1.equals(string4)) {
			System.out.println(string1+" equals "+string4);
		}else {
			System.out.println(string1+" does not equals "+string4);
		}
		if (string1.equalsIgnoreCase(string4)) {
			System.out.println( "Ignoring casse difference"+string1+" equals "+string4);
		}else {
			System.out.println(string1+" does not equals "+string4);
		}
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		// equals() versus ==
		String string5 = "Alpha";
		String string6 = new String(string5);
		
		System.out.println(string5+" equals "+string6+" is "+string5.equals(string6));
		System.out.println(string5+" == "+string6+" is "+(string5 == string6));
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		//regionMatchs()
		String string7 = "Standing at river's edge";
		String string8 = "Running at river's edge";
		
		if (string7.regionMatches(9, string8, 8, 12)) {
			System.out.println("Region match.");
		}
		if (!string7.regionMatches(0, string8, 0, 12)) {
			System.out.println("Region do not match.");
		}
		
		// startsWith() and endsWith()
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		String string9 = "Status: Complete";
		string9.startsWith("Status");
		string9.endsWith("Complete");
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		// compareTo() and CompareToIgnoreCase()
		String string10 = "alpha";
		String string11 = "ALPHA";
		String string12 = "Beta";
		int result;
		
		// Demonstrate the different between compareTo()
		// and CompareToIgnoreCase().
		// less than zero --> the invoking string is less than str.
		// Greater than zero --> the invoking string is greater than str.
		// zero --> The two string are equal.
		
		result = string10.compareTo(string11);
		if(result !=0) {
			System.out.println("Using compareTo(): "+string10+" and "+string11+" differ ");
		}
		result = string10.compareToIgnoreCase(string11);
		if (result < 0) {
			System.out.println("Using compareToIgnoreCase() : "+string10+" and "+string11+" are the same\n");
		}
		// compare alpha to Beta using compareTo()
		System.out.println("Using compareTo() to compare "+string10+" with "+string12);
		result = string10.compareTo(string12);
		if(result <0 ) {
			System.out.println(string10+" is less than "+string12);
		}else if(result == 0) {
			System.out.println(string10+" is equal to "+string12);
		} else {
			System.out.println(string10+" is greater than "+string12);
		}
		System.out.println();
		
		System.out.println("Using compareToIgnoreCase() to compare "+string10+" with "+string12);
		result = string10.compareToIgnoreCase(string12);
		if(result <0 ) {
			System.out.println(string10+" is less than "+string12);
		}else if(result == 0) {
			System.out.println(string10+" is equal to "+string12);
		} else {
			System.out.println(string10+" is greater than "+string12);
		}
		System.out.println();
		
		// indexOf() and lastIndexOf()
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		String string13 ="alpha beta gama theta zeta";
		System.out.println("String 13 is "+string13);
		System.out.println("First index of t is "+string13.indexOf('t'));
		System.out.println("First index of t is "+string13.lastIndexOf('t'));
		System.out.println("The  first index of eta is "+string13.indexOf("eta"));
		System.out.println("The last index of eta is "+string13.lastIndexOf("eta"));
		System.out.println("The first index of eta after position 10 is "+string13.indexOf("eta",10));
		
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		// substring()
		String orgString = "This is a test. This is, too.";
		String searchStr = " is";
		String subStr=" was";
		String resultStr = "";
		int i;
		System.out.println("Original strin: "+orgString);
		// Obtain the second sentence in orgStr. This is 
		// done by first finding the end of the first sentence 
		// and then obtaining the remainder of the string.
		i = orgString.indexOf(".")+2; // Find the end off the first sentence.
		String string14 = orgString.substring(i); //Use substring() to obtain the second sentence.
		System.out.println("Second sentence : "+string14+"\n");
		// Replace all occurrences of searchStr.
		System.out.println("Progressively replacing "+searchStr+" with "+subStr);
		do {
			System.out.println(orgString);
			// find next occurence of searchStr
			i = orgString.indexOf(searchStr);
			if(i!= -1) {
				// obtain the first part of the string 
				resultStr = orgString.substring(0,i);
				
				// Add the replacement sequence
				resultStr = resultStr+subStr;
				
				// Add the remainder of the string, skipping searchStr
				resultStr = resultStr+orgString.substring(i+searchStr.length());
				
				// make the resulting string , the new orgString
				orgString = resultStr;
			}
		} while (i!=-1);
		
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
		
		// replace()
		String ogrStr = "alpha beta gamma alpha beta gamma";
		String resultString;
		System.out.println("Original string : "+ogrStr);
		// First, replace g with x.
		resultString = ogrStr.replace('g', 'X');
		System.out.println(resultString);
		
		// now replace beta with zeta.
		 resultString = resultString.replace("beta", "zeta");
		 System.out.println(resultString);
		 
		 System.out.println("=======================================================================");
		 System.out.println("=======================================================================");
		 
		 //changing the case of characters within a string
		 
		 String string = "This is a test";
		 System.out.println("Original : "+string);
		 String upper = string.toUpperCase();
		 String lower = string.toLowerCase();
		 
		 System.out.println("UpperCase : "+upper);
		 System.out.println("LowerCase : "+lower);
		 
		 // String fromat(String fmtstr, Object args)
	}

}
