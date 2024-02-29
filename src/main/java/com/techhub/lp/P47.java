package com.techhub.lp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
------------------------------------------------------------------------
 Program #47
 Write a program to read year and display that it is leap year of not.
 Note : If year is divisible by 4 then it is leap year.
------------------------------------------------------------------------
*/
public class P47 {

	public static void main(String[] args) throws IOException {

		Scanner scanner =  new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = scanner.nextInt();

		if(year % 4 == 0){
			System.out.println("Leap Year");
		}else{
			System.out.println("Not Leap Year");
		}

		scanner.close();
	}
}