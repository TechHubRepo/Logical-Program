package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
Write a program to read a number and display each digit in words

 123
 ONE TWO THREE
------------------------------------------------------------------------
*/
public class P54 {

	private static final String[] DIGIT_WORD = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};

	public static void main(String[] args) throws Exception {

		Scanner input =  new Scanner(System.in);
		System.out.print("Enter Natural Number  : ");
		String number = input.next();

		for(Character c: number.toCharArray()){
			int t = Integer.parseInt(c.toString());
			System.out.print(DIGIT_WORD[t]+" ");
		}
	}
}