package com.techhub.lp;

/**
 ==================================================================================================
 Program #6 Write a program to draw the following pattern.
 --------------------------------------------------------------------------------------------------
 
******
 *****
  ****
   ***
    **
     *

 ==================================================================================================
 */
public class P6 {
	
	public static void main(String[] args) {
		draw(10);
	}
	
	private static void draw(int number) {
		
		for(int i=1;i<=number;i++) {
			
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			
			for(int j=number;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
