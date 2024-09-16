package com.techhub.collections;

import java.util.*;

/**
 ==================================================================================================
 Program #23

 Sort the Map<String, String> by value and key.
 ==================================================================================================
 */
public class P23 {

    public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Nani", "XYZ");
		map.put("Chintu", "JML");
		map.put("Kanni", "RST");
		map.put("Harika", "HELLO");
		map.put("Srinivas", "BYE");
		map.put("Srini", "NAMASTE");
		
		map.entrySet()	.stream()
			.sorted(Comparator.comparing(Map.Entry::getValue))
			.forEach(System.out::println);
		
		System.out.println("------------------------------");
		
		map.entrySet()	.stream()
			.sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder()))
			.forEach(System.out::println);
		
		System.out.println("------------------------------");
		
		map.entrySet()	.stream()
			.sorted(Comparator.comparing(Map.Entry::getKey))
			.forEach(System.out::println);
		
		System.out.println("------------------------------");
		
		map.entrySet()	.stream()
			.sorted(Comparator.comparing(Map.Entry::getKey,Comparator.reverseOrder()))
			.forEach(System.out::println);

	}
}
