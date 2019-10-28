package com.alokcontactmail.javaUtil;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		
		System.out.println("Default locale: ");
		System.out.println("Country: "+locale.getCountry());
		System.out.println("Name: "+locale.getDisplayName());
		System.out.println("Language: "+locale.getDisplayLanguage());
		
		System.out.println();
		
		Locale indianLocale = new Locale("hi", "IN");
		System.out.println("indianLocale locale: ");
		System.out.println("Country: "+indianLocale.getCountry());
		System.out.println("Name: "+indianLocale.getDisplayName());
		System.out.println("Language: "+indianLocale.getDisplayLanguage());
		
		System.out.println();
		
		System.out.println("France locale: ");
		System.out.println("Country: "+Locale.FRANCE.getCountry());
		System.out.println("Name: "+Locale.FRANCE.getDisplayName());
		System.out.println("Language: "+Locale.FRANCE.getDisplayLanguage());
		
	}

}
