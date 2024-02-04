package com.techhub.lp;

import java.util.Scanner;

/**
--------------------------------------------------
Write a program to read a integer value from user and display it.

Example : Enter Your age : 10
		  Your age : 10
---------------------------------------------------
*/
public class P26 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter Your age : ");
		int age = sc.nextInt();
		System.out.print("Your age : "+age);
		sc.close();
	}
}
