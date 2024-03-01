package com.techhub.collections;

import java.util.List;
import java.util.stream.Stream;

/**
 ==================================================================================================
 Program #6 Print the count of character present in string list as following
 --------------------------------------------------------------------------------------------------

 [ "A", "Namaste", "BHARAT", "How are you?" ]
    1       7         6            12

 ==================================================================================================
 */
public class P6 {
	
	public static void main(String[] args) {
		List<String> list = List.of("A", "Nameste", "BHARAT", "How are you?");
		list.stream().flatMap(v -> {
			return Stream.of(v.length());
		}).forEach(System.out::println);
	}
}
