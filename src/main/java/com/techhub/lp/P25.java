package com.techhub.lp;

import java.util.Scanner;

/**
--------------------------------------------------
Write a program to read a string value from user and display it.

Example : Enter Your Name : Ram Niwash
		  Your Name : Ram Niwash
---------------------------------------------------
*/
public class P25 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.print("Your Name : "+name);
		sc.close();
	}
}
