package com.techhub.collections;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 ==================================================================================================
 Program #14

 Sort the Map<String,String> by value using Stream API Java 8

 Input:
 {a=z, b=y, c=x}

 Output
 {c=x, b=y, a=z}
 ==================================================================================================
 */
public class P14 {

    public static void main(String[] args) {

		Map<String,String> map = Map.of("a","z","b","y","c","x");

		System.out.println(map);

		Map<String, String> sortedByValue = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(sortedByValue);
	}
}