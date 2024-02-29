package com.techhub.lp;

import java.util.HashMap;
import java.util.Map;

/**
 * ----------------------------------------------
 *  Program #19
 *  Find the number of occurrence of character in string.
 * ----------------------------------------------
 * 
 * String = abacba 
 * a = 3 
 * b = 2 
 * c = 1
 * 
 */
public class P19 {

	public static void main(String[] args) {
		countCharOccr("abacba");
		countCharOccr("BHARAT");
	}

	private static void countCharOccr(String str) {
		char[] cArr = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < cArr.length; i++) {
			char c = cArr[i];
			int count = 0;
			for (int j = 0; j < cArr.length; j++) {
				char var2 = cArr[j];
				if (c == var2) {
					count++;
				}
			}
			map.put(c, count);
		}
		System.out.println(map);
	}

}
