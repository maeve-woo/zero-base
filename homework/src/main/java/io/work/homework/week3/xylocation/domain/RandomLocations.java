package io.work.homework.week3.xylocation.domain;

import java.util.ArrayList;
import java.util.List;

public class RandomLocations {
	public static final Integer ROUND = 10;
	private final List<Location> locations;

	public RandomLocations() {
		this.locations = new ArrayList<>();
	}

	public Boolean isDuplicate(Location location) {
		return this.locations.contains(location);
	}

	public void add(Location location) {
		this.locations.add(location);
	}

	public List<Location> getLocations() {
		return this.locations;
	}
}
