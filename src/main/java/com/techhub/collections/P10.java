package com.techhub.collections;

/**
 ==================================================================================================
 Program #10 Find the character occurrence in a String using Stream API.

 abccdefgaagfecdaagaabccdef
 --------------------------------------------------------------------------------------------------

 a = 7
 ==================================================================================================
 */
public class P10 {
	
	public static void main(String[] args) {
		String str = "abccdefgaagfecdaagaabccdef";
		char searchChar = 'a';

		long c = str.chars().filter(v->{
			return v==searchChar;
		}).count();

		System.out.println(searchChar+" = "+c);
	}
}
