package com.techhub.lp;

/**
----------------------------------------------
Write a program to drew the following pattern.
----------------------------------------------

   *
  * *
 *   *
*     *
 *   *
  * *
   *
   
----------------------------------------------
*/
public class P16 {
	
	public static void main(String[] args) {
		draw(7);
	}
	
	private static void draw(int number) {
		
		if(number%2==0) {
			number++;
		}
		
		int outerItr = number;
		int spaceCount = outerItr/2+1;
		int starCount = 1;
		boolean flag = false;
		for(int i=1; i <= outerItr; i++) {
			
			for(int k=1; k < spaceCount; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=starCount; j++) {
				if(j==1 || j==starCount) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			if(starCount==number) {
				flag = true;
			}
		
			if(flag) {
				spaceCount++;
				starCount-=2;
			}else {
				spaceCount--;
				starCount+=2;
			}
			System.out.println();
		}
	}
}
