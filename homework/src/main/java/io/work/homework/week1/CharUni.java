package io.work.homework.week1;

public class CharUni {
	public static void main(String[] args) {
		String name = "덕타이핑";

		printName(name);
		printName("박규태");
	}

	public static void printName(String name) {
		for (char c: name.toCharArray()) {
			for (int i = Character.MIN_VALUE; i < Character.MAX_VALUE; i++ ) {
				if (i == c) {
					System.out.println(Integer.toHexString(i));
					break;
				}
			}
		}
	}
}
