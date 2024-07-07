package com.techhub.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 ==================================================================================================
 Program #20

 Find the occurrence of each word in following syntax and store in map using Stream API.

 Input:
 This Project is completed by Ram and this project documentation is completed by Ram

 Output:
 {and=1, by=2, documentation=1, this=2, project=2, is=2, completed=2, ram=2}
 ==================================================================================================
 */
public class P20 {

    public static void main(String[] args) {

		String s1 = "This Project is completed by Ram and this project documentation is completed by Ram";

		String[] words = s1.split("[ ]+");

		Map<String,Long> wordCount = Arrays.stream(words).map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(wordCount);
	}
}