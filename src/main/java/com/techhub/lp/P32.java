package com.techhub.lp;

import java.util.Scanner;

/**
 ==================================================================================================
 Program #32 Write a program to read two numbers and display the sum of without using + operator.
 --------------------------------------------------------------------------------------------------
 Example :
	Enter Number A : 7
	Enter Number B : 3
	Sum = 10

 ==================================================================================================
*/
public class P32 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter Number A : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Number B : ");
		int b = sc.nextInt();
		
		/*
		 * 	Bitwise AND (&) Operator
		 *  -----------------------
		 *  |  A  |  B  |  A & B  |
		 *  -----------------------  
		 *  |  0  |  0  |    0    |
		 *  |  0  |  1  |    0    |
		 *  |  1  |  0  |    0    |
		 *  |  1  |  1  |    1    |
		 *  -----------------------
		 *  
		 * 	Bitwise OR (&) Operator
		 *  -----------------------
		 *  |  A  |  B  |  A & B  |
		 *  -----------------------  
		 *  |  0  |  0  |    0    |
		 *  |  0  |  1  |    1    |
		 *  |  1  |  0  |    1    |
		 *  |  1  |  1  |    1    |
		 *  -----------------------
		 *  
		 *  Bitwise XOR Operator
		 *  -----------------------
		 *  |  A  |  B  |  A ^ B  |
		 *  -----------------------  
		 *  |  0  |  0  |    0    |
		 *  |  0  |  1  |    1    |
		 *  |  1  |  0  |    1    |
		 *  |  1  |  1  |    1    |
		 *  -----------------------
		 */

		while (b != 0) 
        {
            // carry now contains common
            // set bits of x and y
            int carry = a & b;
 
            // Sum of bits of x and 
            // y where at least one 
            // of the bits is not set
            a = a ^ b;
 
            // Carry is shifted by 
            // one so that adding it 
            // to x gives the required sum
            b = carry << 1;
        }
		int sum = a;
				
		System.out.println("Sum = "+sum);
		sc.close();
	}
}