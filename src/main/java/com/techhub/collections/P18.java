package com.techhub.collections;

import java.util.List;
import java.util.stream.Stream;

/**
 ==================================================================================================
 Program #18

 Add two List<String> l1 and l2 into l3 using Java 8 Stream API.

 Input
 l1 = [Namaste, Hello, Hi, Bharat]
 l2 = [ABC, XYZ, PQR]

 Output
 l3 = [Namaste, Hello, Hi, Bharat, ABC, XYZ, PQR]
 ==================================================================================================
 */
public class P18 {

    public static void main(String[] args) {
		List<String> l1 = List.of("Namaste", "Hello", "Hi", "Bharat");
		List<String> l2 = List.of("ABC", "XYZ", "PQR");
		System.out.println(l1);
		System.out.println(l2);
		List<String> l3 = Stream.concat(l1.stream(),l2.stream()).toList();
		System.out.println(l3);
	}
}