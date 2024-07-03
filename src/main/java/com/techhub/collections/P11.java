package com.techhub.collections;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 ==================================================================================================
 Program #12

 Find the first non-repeated character in a given string input using Java 8 or later

 Input

 session
 express
 abxddxeaab

 ==================================================================================================
 */
public class P11 {
	
	public static void main(String[] args) {
		System.out.println(findNonRepeated("session"));
		System.out.println(findNonRepeated("express"));
		System.out.println(findNonRepeated("abxddxpaab"));
	}

	public static Character findNonRepeated(String input){

			Character result =  input.chars()           // IntStream
					.mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
					.entrySet().stream()
					.filter(entry -> entry.getValue() == 1L)
					.map(entry -> entry.getKey())
					.findFirst().get();

			return result;

	}
}
