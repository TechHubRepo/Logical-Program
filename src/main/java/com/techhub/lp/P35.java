package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
 Write a program to age of person and display the person is eligible to vote or not.

 Example : You are eligible to vote

------------------------------------------------------------------------
*/
public class P35 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter a age : ");
		int age = sc.nextInt();

		if(age>18){
			System.out.println("Your are eligible to vote");
		}else{
			System.out.println("Your are not eligible to vote");
		}

		sc.close();
	}
}