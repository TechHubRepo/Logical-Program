package com.techhub.lp;

/**
 ==================================================================================================
 Program #11 Write a program to draw the following pattern.
 --------------------------------------------------------------------------------------------------
 
   *
  ***
 *****
*******

 ==================================================================================================
 */
public class P11 {
	
	public static void main(String[] args) {
		draw(7);
	}
	
	private static void draw(int number) {
		
		int outerItr= number/2+1;		
		int starCount=1;
		
		for(int i=1;i<=outerItr;i++) {			
			for(int j=outerItr-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=starCount;k++) {
				System.out.print("*");
			}
			starCount+=2;
			System.out.println();
		}
	}
}
