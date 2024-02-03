package com.techhub.lp;

import java.util.Scanner;

/**
--------------------------------------------------
Write a program to read a char value from user and display it.

Example : Enter a Character : H
		  You entered :  : H
---------------------------------------------------
*/
public class P28 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);		
		System.out.print("Enter a Character : ");
		String name = sc.next();
		System.out.println("You entered : "+name.charAt(0));
		sc.close();
	}
}