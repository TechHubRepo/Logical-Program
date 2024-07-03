package com.techhub.collections;

import java.util.List;
import java.util.stream.Stream;

/**
 ==================================================================================================
 Program #13

 2D array = {{2,4,6},{5,8,9}} = > {2,3,4,5,6}
 find  5 Using Stream API
 ==================================================================================================
 */
public class P13 {

    public static void main(String[] args) {

		Integer[][] arr = {{2,4,6},{5,8,9}};

		Stream<Integer[]> st = Stream.of(arr);

		st.flatMap(Stream::of).filter(e->{return e==11;}).forEach(System.out::println);

	}
}