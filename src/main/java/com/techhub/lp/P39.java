package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
 Program #39
 Write a program to read three number and display maximum of them.
------------------------------------------------------------------------

 Example : 	5 is maximum

------------------------------------------------------------------------
*/
public class P39 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter number A : ");
		int a = sc.nextInt();

		System.out.print("Enter number B : ");
		int b = sc.nextInt();

		System.out.print("Enter number C : ");
		int c = sc.nextInt();

		if(a>b && a>c){
			System.out.println(a+" is maximum");
		}else if(b>a && b>c){
			System.out.println(b+" is maximum");
		}else{
			System.out.println(c+" is maximum");
		}

		sc.close();
	}
}