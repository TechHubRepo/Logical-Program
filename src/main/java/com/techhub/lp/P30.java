package com.techhub.lp;

import java.util.Scanner;

/**
--------------------------------------------------
Write a program to read two numbers and swap them without using third variable.

Enter Number A : 52
Enter Number B : 33
A = 33
B = 52

---------------------------------------------------
*/
public class P30 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter Number A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Number B : ");
		int b = sc.nextInt();
		
		/*
		 *  A = 5
		 *  B = 3
		 *  
		 *  A = A + B = 5 + 3 = 8
		 *  B = A - B = 8 - 3 = 5
		 *  A = A - B = 8 - 5 = 3
		 */
		
		a = a + b;
		b = a - b;
		a = a - b;
				
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		sc.close();
	}
}