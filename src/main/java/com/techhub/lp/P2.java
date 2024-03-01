package com.techhub.lp;

/**
 ==================================================================================================
 Program #2 Write a program to draw the following pattern.
 --------------------------------------------------------------------------------------------------
********
*      *
*      *
*      *
********

 ==================================================================================================
 */
public class P2 {
	
	public static void main(String[] args) {
		draw(8);
	}
	
	private static void draw(int number) {
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++) {
				if(i==1 || i==number || j==1 || j==number) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
