package com.java;

public class Swap {

	// private void swap() {
	// int a = 10;
	// int b = 20;
	// int c;
	// c = b;
	// b = a;
	// a = c;
	// System.out.println(a);
	// System.out.println(b);
	// }
	public static void main(String[] args) {

		int a = 10;
		int d = 20;
		int c = 30;
		int b = 40;

		d = d - a;
		a = a + d;
		b = b - c;
		c = b + c;
		b = a + d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
