package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
 Write a program to read a number and display the sum of first n natural number.

 1+2+3+4+5 = 15

 sum of first n natural number = n(n+1)/2
------------------------------------------------------------------------
*/
public class P52 {

	public static void main(String[] args) throws Exception {

		Scanner input =  new Scanner(System.in);
		System.out.print("Enter Natural Number  : ");
		int n = input.nextInt();

		int sum = n*(n+1)/2;

		System.out.println("Sum of first n natural number = "+sum);

		input.close();
	}
}