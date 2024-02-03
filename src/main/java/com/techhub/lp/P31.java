package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
Write a program to read two numbers and swap them using bitwise operator

Enter Number A : 52
Enter Number B : 33
A = 33
B = 52

Note : Bitwise operator works on bits of binary number.
------------------------------------------------------------------------
*/
public class P31 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter Number A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Number B : ");
		int b = sc.nextInt();
		
		/*
		 *    XOR Operator Table
		 *  -----------------------
		 *  |  A  |  B  |  A ^ B  |
		 *  -----------------------  
		 *  |  0  |  0  |    0    |
		 *  |  0  |  1  |    1    |
		 *  |  1  |  0  |    1    |
		 *  |  1  |  1  |    1    |
		 *  -----------------------
		 */
		
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;  
				
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		sc.close();
	}
}