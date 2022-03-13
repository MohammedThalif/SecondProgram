package com.java;

public class ReverseString {

	public String reverse(String input) {
		String rev = "";

		for (int i = input.length()-1; i >= 0; i--) {
			char charAt = input.charAt(i);
			rev = rev + charAt;
		}

		return rev;

	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		String reverse = obj.reverse("Tha");

		System.out.println(reverse);
	}

}
