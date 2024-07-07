package com.techhub.collections;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 ==================================================================================================
 Program #19

 Find the occurrence of 1s in integer array using java 8 Stream API

 Input
 int[] arr = {11,12,13,41,111,101,1001};

 Output
 12
 ==================================================================================================
 */
public class P19 {

    public static void main(String[] args) {
		int[] arr = {11,12,13,41,111,101,1001};

		long count = Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining()).chars().filter(e->{
					return ((char) e) == '1';
				})
				.count();

		System.out.println(count);

	}
}