package com.techhub.lp;

import java.util.Scanner;
import java.io.Reader;

/**
------------------------------------------------------------------------
 Program #51
 Write a program to read a number and display the first n natural number.
------------------------------------------------------------------------
 1,2,3,4, ...., 20
 21,22,23 ...., 40
 .
 .
 .
 m, m+1, m+2, .... n
------------------------------------------------------------------------
*/
public class P51 {

	public static void main(String[] args) throws Exception {

		Scanner input =  new Scanner(System.in);
		System.out.print("Enter Natural Number  : ");
		int n = input.nextInt();

		int count = 0;

		for(int i=1;i<=n;i++){
			count++;
			if(count>20){
				System.out.println();
				count=1;
			}
			System.out.print(i+", ");
		}

		input.close();
	}
}