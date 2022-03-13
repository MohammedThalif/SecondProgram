package com.java;

public class StringTypes_Upper_Lower_Num_SpecialChar {

	public void StringTypes(String input) {

		String Uppercase = "";
		String Lowercase = "";
		String Num = "";
		String Special = "";

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);

			if (Character.isUpperCase(c)) {
				Uppercase = Uppercase + c;
			} else if (Character.isLowerCase(c)) {
				Lowercase = Lowercase + c;
			} else if (Character.isDigit(c)) {
				Num = Num + c;
			} else {

				Special = Special + c;

			}
		}
		System.out.println(Special);
		System.out.println(Uppercase);
		System.out.println(Lowercase);
		System.out.println(Num);
	}

	public static void main(String[] args) {
		StringTypes_Upper_Lower_Num_SpecialChar obj = new StringTypes_Upper_Lower_Num_SpecialChar();
		obj.StringTypes("thalif@@#$123MOHAMMED");
	}

}
