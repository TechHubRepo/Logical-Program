package com.techhub.lp;

/**
----------------------------------------------
 Program #9
 Write a program to draw the following pattern.
---------------------------------------------- 
 
     *
    **
   * *
  *  *
 *   *
******

----------------------------------------------
 */
public class P9 {
	
	public static void main(String[] args) {
		draw(10);
	}
	
	private static void draw(int number) {
		
		for(int i=1;i<=number;i++) {
			for(int k=number;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {	
				if(j==1 || j==i || i==number) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
