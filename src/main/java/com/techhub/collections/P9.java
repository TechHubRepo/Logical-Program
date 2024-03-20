package com.techhub.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 ==================================================================================================
 Program #9 Map all the elements in single array from multiple arrays

 {{1,2}, {3,4}, {5,6}, {7,8}}
 --------------------------------------------------------------------------------------------------

 [1, 2, 3, 4, 5, 6, 7, 8]

 ==================================================================================================
 */
public class P9 {
	
	public static void main(String[] args) {
		Integer[][] intArr = {{1,2}, {3,4}, {5,6}, {7,8}};
		Stream<Integer[]> myStream = Stream.of(intArr);

		List<Integer> list = myStream.flatMap(Stream::of).toList();

//		List<Integer> list = myStream.flatMap(arr->{
//			return Stream.of(arr);
//		}).toList();

		System.out.println(list);
	}
}
