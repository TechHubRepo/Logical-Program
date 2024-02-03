package com.techhub.lp;

/**
--------------------------------------------------
Reverse the  String.

Example :  ABCD -> DCBA
---------------------------------------------------
*/
public class P23 {

	public static void main(String[] args) {
		reverse("ABCD");
	}

	public static void reverse(String s1) {
		char[] array = s1.toCharArray();
		int size = array.length - 1;
		int iteration = (size / 2) + 1;
		for (int i = 0; i < iteration; i++) {
			char c1 = array[i];
			array[i] = array[size - i];
			array[size - i] = c1;
		}
		System.out.println(new String(array));
	}
}
