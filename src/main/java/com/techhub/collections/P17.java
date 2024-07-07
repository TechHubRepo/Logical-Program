package com.techhub.collections;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 ==================================================================================================
 Program #17

 Find the length of each String in list using Stream API and store in Map as followings.

 {Hi=2, Namaste=7, Hello=5, Bharat=6}
 ==================================================================================================
 */
public class P17 {

    public static void main(String[] args) {

		List<String> list = List.of("Namaste", "Hello", "Hi", "Bharat");

		Map<String,Integer> wordLen = list.stream().collect(Collectors.toMap(String::toString,String::length));

		System.out.println(wordLen);
	}
}