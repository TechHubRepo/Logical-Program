package com.techhub.java8lp;

import java.util.*;

/**
 ----------------------------------------------
 Program #2

 Find the 3rd Highest number from given List of integer
 ----------------------------------------------

 [12, 5, 7, 9, 2 ,10, 20, 9, 11, 18 , 16, 11, 4]

 Output : 16
 
 ----------------------------------------------
 */
public class P2 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 5, 7, 9, 2 ,10, 20, 9, 11, 18 , 16, 11, 4);
		Set<Integer>  duplicates = findDuplicate(numbers);
		System.out.println(duplicates);
	}
	
	private static Set<Integer> findDuplicate(List<Integer> numbers) {
		Set<Integer> result = new HashSet<>();
		Set<Integer> numberSet = new HashSet<>();
		for(Integer n : numbers){
			if(numberSet.contains(n)){
				result.add(n);
			}else{
				numberSet.add(n);
			}
		}
		return result;
	}
}
