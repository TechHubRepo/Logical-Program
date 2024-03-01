package com.techhub.lp;

import java.util.Scanner;

/**
 ==================================================================================================
 Program #36 Write a program to read a number and display that it is even or odd.
 --------------------------------------------------------------------------------------------------

 Example : 	5 is odd
 			10 is even

 ==================================================================================================
*/
public class P36 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number = sc.nextInt();

		if(number%2==0){
			System.out.println(number+" is even");
		}else{
			System.out.println(number+" is odd");
		}

		sc.close();
	}
}