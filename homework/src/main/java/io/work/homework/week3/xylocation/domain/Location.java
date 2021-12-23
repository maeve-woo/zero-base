package io.work.homework.week3.xylocation.domain;

import java.util.List;
import java.util.Objects;

public class Location {
	private Integer x;
	private Integer y;

	public Location(List<Integer> locations) {
		this.x = locations.get(0);
		this.y = locations.get(1);
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ')';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Location location = (Location) o;
		return Objects.equals(x, location.x) && Objects.equals(y, location.y);
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}
