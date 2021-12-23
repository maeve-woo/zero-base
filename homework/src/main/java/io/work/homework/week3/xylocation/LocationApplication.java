package io.work.homework.week3.xylocation;


import io.work.homework.week3.xylocation.ui.LocationIO;

public class LocationApplication {
	private static final LocationIO locationIO = new LocationIO();

	public static void main(String[] args) {
		locationIO.run();
	}
}
