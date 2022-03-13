package com.java;

public class ReverseNumber {

	private void Revr(int num) {

		int qu = num, rev = 0, rem = 0;

		while (qu > 0) {

			rem = qu % 10;
			rev = (rev * 10) + rem;
			qu = qu / 10;

		}
		System.out.println(rev);
	}

	public static void main(String[] args) {

		ReverseNumber r = new ReverseNumber();
		r.Revr(12345);

	}

}
