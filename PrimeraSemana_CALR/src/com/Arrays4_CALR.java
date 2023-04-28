package com;

public class Arrays4_CALR {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };

		int[] arrayReversa = new int[array1.length];

		for (int i = (array1.length - 1), j = 0; i >= 0; i--, j++) {
			arrayReversa[j] = array1[i];
			System.out.print(arrayReversa[j]);
		}
	}

}
