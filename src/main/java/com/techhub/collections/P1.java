package com.techhub.collections;

import java.util.*;

/**
 ==================================================================================================
 Program #1
 Find the 3rd Highest number from given List of integer
 --------------------------------------------------------------------------------------------------

 [12, 5, 7, 9, 2 ,10, 20, 9, 11, 18 , 16, 11, 4]

 Output : 16

 ==================================================================================================
 */
public class P1 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 5, 7, 9, 2 ,10, 20, 9, 11, 18 , 16, 11, 4);
		int number = find3rdHighest(numbers);
		System.out.println(number);
	}
	
	private static int find3rdHighest(List<Integer> numbers) {
		Collections.sort(numbers);
		return numbers.get(numbers.size()-3);
	}
}
