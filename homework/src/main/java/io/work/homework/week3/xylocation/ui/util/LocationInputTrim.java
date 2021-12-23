package io.work.homework.week3.xylocation.ui.util;

public class LocationInputTrim {
	public static String[] trimSpecialCharacters(String location) {
		String locationCopy = location;
		locationCopy = locationCopy.replace(")", "");
		locationCopy = locationCopy.replace("(", "");
		return locationCopy.split(",");
	}
}
