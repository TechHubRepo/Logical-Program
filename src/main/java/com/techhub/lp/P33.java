package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
 Program #33
 Write a program to convert fahrenheit to celsius
------------------------------------------------------------------------

Example : celsius = (fahrenheit-32)*5/9;

------------------------------------------------------------------------
*/
public class P33 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter fahrenheit : ");
		int fahrenheit = sc.nextInt();

		int celsius = (fahrenheit-32)*5/9;
				
		System.out.println("Sum = "+celsius);
		sc.close();
	}
}