package com.techhub.lp;

import java.io.IOException;
import java.util.Scanner;

/**
------------------------------------------------------------------------
 Write a program to read month and year and display the number of days in month.

 1 : 31
 2 : 28/29
 3 : 30
 4 : 30
 5 : 31
 6 : 30
 7 : 31
 8 : 31
 9 : 30
 10 : 31
 11 : 30
 12 : 31
------------------------------------------------------------------------
*/
public class P50 {

	private static  final byte[] NO_OF_DAYS = {
			31,
			28,
			30,
			30,
			31,
			30,
			31,
			31,
			30,
			31,
			30,
			31
	};

	public static void main(String[] args) throws IOException {

		Scanner input =  new Scanner(System.in);
		System.out.print("Enter Month : ");
		int month = input.nextInt();

		System.out.print("Enter Year : ");
		int year = input.nextInt();

		if(month < 1 || month > 12 ){
			System.out.println("INVALID NUMBER OF MONTH");
		}else{
			if(month==2){
				if(year %4 ==0){
					System.out.println("Days = "+ 29 +" ; Month = "+month+" ; Year = "+year);
				}else{
					System.out.println("Days = "+  NO_OF_DAYS[month-1] +" ; Month = "+month+" ; Year = "+year);
				}
			}else{
				System.out.println("Days = "+ NO_OF_DAYS[month-1] +" ; Month = "+month+" ; Year = "+year);
			}
		}

		input.close();
	}
}