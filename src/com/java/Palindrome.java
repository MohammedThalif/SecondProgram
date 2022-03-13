package com.java;

public class Palindrome {

	private boolean P1(String input) {
		String rev = "";
		Boolean b = false;
		for (int i = input.length() - 1; i >= 0; i--) {
			char charAt = input.charAt(i);
			rev = rev + charAt;
		}
		if (rev.equals(input)) {
			b = true;
		} else {

			b = false;
		}
		return b;
	}

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		boolean p1 = obj.P1("racecar");
		System.out.println(p1);
		boolean p12 = obj.P1("Thalif");
		System.out.println(p12);
	}

}
