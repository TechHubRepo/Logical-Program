package com.techhub.lp;

import java.util.Scanner;

/**
--------------------------------------------------------------------------
 Program #29
 Write a program to read two numbers and swap them using third variable.
--------------------------------------------------------------------------
Enter Number A : 52
Enter Number B : 33
A = 33
B = 52

--------------------------------------------------------------------------
*/
public class P29 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter Number A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Number B : ");
		int b = sc.nextInt();
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		sc.close();
	}
}