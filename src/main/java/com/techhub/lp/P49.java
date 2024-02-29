package com.techhub.lp;

import java.io.IOException;
import java.util.Scanner;

/**
------------------------------------------------------------------------
 Program #49
 Write a program to read a number form 0 to 6 and display the corresponding day of week
------------------------------------------------------------------------
 0 Sunday
 1 Monday
 2 Tuesday
 3 Wednesday
 4 Thursday
 5 Friday
 6 Saturday
------------------------------------------------------------------------
*/
public class P49 {

	private static  final String[] DAY_OF_WEEK = {"SUNDAY", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	public static void main(String[] args) throws IOException {

		Scanner input =  new Scanner(System.in);
		System.out.print("Enter a number of weekday : ");
		int dayNumber = input.nextInt();

		if(dayNumber < 0 || dayNumber > 6 ){
			System.out.println("INVALID NUMBER OF DAY");
		}else{
			System.out.println(DAY_OF_WEEK[dayNumber]);
		}

		input.close();
	}
}