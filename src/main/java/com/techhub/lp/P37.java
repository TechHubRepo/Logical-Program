package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
 Program #37
 Write a program to read two number and display maximum of number.
------------------------------------------------------------------------

 Example : 	5 is maximum

------------------------------------------------------------------------
*/
public class P37 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter number A : ");
		int a = sc.nextInt();

		System.out.print("Enter number B : ");
		int b = sc.nextInt();

		if(a>b){
			System.out.println(a+" is maximum");
		}else{
			System.out.println(b+" is maximum");
		}

		sc.close();
	}
}