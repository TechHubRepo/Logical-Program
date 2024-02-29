package com.techhub.lp;

import java.util.Scanner;

/**
------------------------------------------------------------------------
 Program #40
 Write a program to read three number and display minimum of them.
------------------------------------------------------------------------

 Example : 	5 is minimum

------------------------------------------------------------------------
*/
public class P40 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter number A : ");
		int a = sc.nextInt();

		System.out.print("Enter number B : ");
		int b = sc.nextInt();

		System.out.print("Enter number C : ");
		int c = sc.nextInt();

		if(a<b && a<c){
			System.out.println(a+" is minimum");
		}else if(b<a && b<c){
			System.out.println(b+" is minimum");
		}else{
			System.out.println(c+" is minimum");
		}

		sc.close();
	}
}