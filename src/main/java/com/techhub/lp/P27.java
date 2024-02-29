package com.techhub.lp;

import java.util.Scanner;

/**
----------------------------------------------------------------------------------------------------
 Program #27
 Write a program to read a string value from user and display its individual characters.
----------------------------------------------------------------------------------------------------

 Example : Enter Your Name : Ram Niwash
		  Your Name : R,a,m, ,N,i,w,a,s,h,
---------------------------------------------------
*/
public class P27 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		char[] arr = name.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		sc.close();
	}
}
