package com.senal.lucky;

public class MyPicks {

	public static void main(String[] args) {
		Integer[] prev = { 2, 4, 8, 43, 23, 3, 55, 66, 22, 67 };
		Rows r = new Rows(prev, 6);
		System.out.println(r.toString());
	}
}
