package com.alokcontactmail.javaUtil;

import java.util.Formatter;

public class CitiesDemo {

	public static void main(String[] args) {
		City [] cities = {new City("Dallas", 1197816),
				new City("Portland", 583776),
				new City("Frostbite Falls", 6424),
				new City("New York", 8175133)};
		String result = formatCities(cities);
		System.out.println(result);
	}

	private static String formatCities(City[] cities) {
		Formatter formatter = new Formatter();
		String result;
		int col1 = 0;
		int col2 = 0;
		// find width of the columns
		for(City city: cities) {
			if(city.name.length()>col1) {
				col1 = city.name.length();
			}
			if (Integer.toString(city.pop).length()>col2) {
				col2 = Integer.toString(city.pop).length();
			}
		}
		String frmt = "| %-"+col1+"s | %"+col2+"d |\n";
		for(City city: cities) {
			formatter.format(frmt, city.name,city.pop);
		}
		result = formatter.toString();
		formatter.close();
		return result;
	}

}
