package com.techhub.lp;

import java.util.List;
import java.util.Scanner;

/**
------------------------------------------------------------------------
 Program #55
 Write a program to read a number show that it is power of 2 or not
------------------------------------------------------------------------

 4 = 2 * 2
 8  = 2 * 2 * 2
 16 = 2 * 2 * 2 * 2
 32 = 2 * 2 * 2 * 2 * 2

------------------------------------------------------------------------
*/
public class P55 {

	public static void main(String[] args) throws Exception {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int number = input.nextInt();
		System.out.println(isPowerOfTwo(number));
	}

	private static boolean isPowerOfTwo(int number){
		boolean flag = false;
		int n = 4;
		while(n <= number){
			if(n == number){
				flag = true;
				break;
			}
			n += n;
		}
		return flag;
	}
}