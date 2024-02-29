package com.techhub.lp;

/**
----------------------------------------------
 Program #15
 Write a program to draw the following pattern.
----------------------------------------------

   *
  ***
 *****
*******
 *****
  ***
   *
   
----------------------------------------------
*/
public class P15 {
	
	public static void main(String[] args) {
		draw(8);
	}
	
	private static void draw(int number) {
		
		if(number%2==0) {
			number++;
		}
		
		int outerItr = number;
		int spaceCount = outerItr/2+1;
		int startCount = 1;
		boolean flag = false;
		for(int i=1; i <= outerItr; i++) {
			
			for(int k=1; k < spaceCount; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=startCount; j++) {
				System.out.print("*");
			}
			
			if(startCount==number) {
				flag = true;
			}
		
			if(flag) {
				spaceCount++;
				startCount-=2;
			}else {
				spaceCount--;
				startCount+=2;
			}
			System.out.println();
		}
	}
}
