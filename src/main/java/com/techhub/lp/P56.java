package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
 Program #56
 Write a program to read a number show its table
------------------------------------------------------------------------
 2
 4
 6
 8
 10
 12
 14
 16
 18
 20
------------------------------------------------------------------------
*/
public class P56 {

	public static void main(String[] args) throws Exception {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int number = input.nextInt();
		printTable(number);
	}

	private static void printTable(int number){
		for(int i = 1; i <= 10 ; i++){
			System.out.println(number*i);
		}
	}
}