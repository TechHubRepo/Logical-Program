package com.techhub.lp;

/**
---------------------------------------------- 
Write a program to drew the following pattern.
---------------------------------------------- 
 
*******
 *****
  ***
   *

----------------------------------------------
 */
public class P12 {
	
	public static void main(String[] args) {
		draw(7);
	}
	
	private static void draw(int number) {
		
		int outerItr = number/2+1;		
		int starCount = number;
		
		for(int i=1; i <= outerItr; i++) {			
			for(int j = 1;j < i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k <= starCount; k++) {
				System.out.print("*");
			}
			starCount-=2;
			System.out.println();
		}
	}
}
