package com.techhub.collections;

import java.util.*;

/**
 --------------------------------------------------------
 Program #2
 Find the duplicate numbers from given List of integer
 --------------------------------------------------------

 [12, 5, 7, 9, 2 ,10, 20, 9, 11, 18 , 16, 11, 4]

 Output : [9,11]
 
 --------------------------------------------------------
 */
public class P2 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 5, 7, 9, 2 ,10, 20, 9, 11, 18 , 16, 11, 4);
		Set<Integer>  duplicates = findDuplicate(numbers);
		System.out.println(duplicates);
	}
	
	private static Set<Integer> findDuplicate(List<Integer> numbers) {
		Set<Integer> duplicates = new HashSet<>();
		Set<Integer> numberSet = new HashSet<>();
		for(Integer n : numbers){
			if(numberSet.contains(n)){
				duplicates.add(n);
			}else{
				numberSet.add(n);
			}
		}
		return duplicates;
	}
}
