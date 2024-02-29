package com.techhub.lp;

/**
----------------------------------------------
 Program #5
 Write a program to draw the following pattern.
----------------------------------------------
     *
    **
   ***
  ****
 *****
******

----------------------------------------------
 */
public class P5 {
	
	public static void main(String[] args) {
		draw(10);
	}
	
	private static void draw(int number) {
		
		for(int i=1;i<=number;i++) {
			
			for(int k=number;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
