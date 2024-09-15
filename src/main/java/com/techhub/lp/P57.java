package com.techhub.lp;

import java.util.Scanner;

/**
 ==================================================================================================
 Program #57 Write a program to read two number and display its quotient without using / operator.
 --------------------------------------------------------------------------------------------------
	Enter number a = 10
 	Enter number b = 5
 	Quotient = 2
 ==================================================================================================
*/
public class P57 {

	public static void main(String[] args) throws Exception {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter number a = ");
		int numberA = input.nextInt();
		System.out.print("Enter number b = ");
		int numberB = input.nextInt();
		System.out.println(findQuotient(numberA, numberB));
		input.close();
	}

	private static int findQuotient(int numberA, int numberB){
		return numberA/numberB;
	}
}