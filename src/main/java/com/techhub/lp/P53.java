package com.techhub.lp;

import java.util.Scanner;

/**
 ==================================================================================================
 Program #53 Write a program to find the sum of command line argument
 --------------------------------------------------------------------------------------------------
 5 10 15

 sum = 30
 ==================================================================================================
*/
public class P53 {

	public static void main(String[] args) throws Exception {

		int sum = 0;

		for(String arg : args){
			sum+=Integer.parseInt(arg);
		}
		System.out.println("Sum = "+sum);
	}
}