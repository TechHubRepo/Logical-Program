package com.techhub.collections;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		String[] inputs = {"session","express","abxddxprsaab"};

		for(String input:inputs){
			findNonRepeated(input);
			System.out.println();
		}
	}

	public static void findNonRepeated(String input){

			LinkedHashMap <Character,Long> map = input.chars()
					.mapToObj(e->Character.toLowerCase((char) e))
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

			Stream<Character> characters = map.entrySet().stream().filter(es -> {return es.getValue() == 1L;}).map(es->es.getKey());

			characters.forEach(System.out::print);

	}
}
