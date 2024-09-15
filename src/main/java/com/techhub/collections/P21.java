package com.techhub.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 ==================================================================================================
 Program #21

 Find Duplicate Chars In String using Stream API.

 Input:
 abcdefaddeabxyxx

 Output:
 a,b,d,e,x

 ==================================================================================================
 */
public class P21 {

    public static void main(String[] args) {

		String[] inputs = {"abcdefaddeabxyxx","Ram Niwash is a Java Developer"};

		for(String input:inputs){
			System.out.println(input+" = "+findDuplicateCharsInString(input));
		}
	}

	/*
	 * Complete the 'findDuplicateCharsInString' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts STRING inputValue as parameter.
	 */

	public static String findDuplicateCharsInString(String inputValue) {

		StringBuilder result = new StringBuilder();

		Map<String, Long> countingMap = inputValue.chars().mapToObj(c-> { return String.valueOf((char) c); })
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		countingMap.entrySet().stream().filter(es->{
			return es.getValue()>1;
		}).sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e->{
			if(!e.getKey().isBlank()) {
				result.append(e.getKey()).append(",");
			}
		});
		result.deleteCharAt(result.length()-1);
		return result.toString();
	}
}
