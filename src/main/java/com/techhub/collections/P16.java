package com.techhub.collections;

import java.util.List;

/**
 ==================================================================================================
 Program #16

 Find the length of each String in list using Stream API
 ==================================================================================================
 */
public class P16 {

    public static void main(String[] args) {

		List<String> list = List.of("Namaste", "Hello", "Hi", "Bharat");

		list.stream().mapToInt(e->e.length()).forEach(System.out::println);

	}
}