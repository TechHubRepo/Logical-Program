package com.techhub.lp;

import java.util.Scanner;

/**
 ==================================================================================================
 Program #38 Write a program to read two number and display minimum of number.
 --------------------------------------------------------------------------------------------------

 Example : 	5 is minimum

 ==================================================================================================
*/
public class P38 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("Enter number A : ");
		int a = sc.nextInt();

		System.out.print("Enter number B : ");
		int b = sc.nextInt();

		if(a<b){
			System.out.println(a+" is minimum");
		}else{
			System.out.println(b+" is minimum");
		}

		sc.close();
	}
}