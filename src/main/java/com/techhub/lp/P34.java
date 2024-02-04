package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
Write a program to read a number and display it is positive or not.

 Example : 9 is Positive
 -8 is negative

------------------------------------------------------------------------
*/
public class P34 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();

		if(number>0){
			System.out.println(number+" is Positive");
		}else{
			System.out.println(number+" is negative");
		}

		sc.close();
	}
}