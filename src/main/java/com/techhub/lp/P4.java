package com.techhub.lp;

/**
----------------------------------------------
 Program #4
 Write a program to draw the following pattern.
----------------------------------------------
******
*****
****
***
**
*

----------------------------------------------
 */
public class P4 {
	
	public static void main(String[] args) {
		draw(8);
	}
	
	private static void draw(int number) {
		
		for(int i=1;i<=number;i++) {
			for(int j=number;j>=i;j--) {				
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
