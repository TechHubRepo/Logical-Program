package com.techhub.lp;

/**
---------------------------------------------- 
Write a program to drew the following pattern.
---------------------------------------------- 
 
*
**
* *
*  *
*   *
*    *
*     *
********

----------------------------------------------
 */
public class P7 {
	
	public static void main(String[] args) {
		draw(10);
	}
	
	private static void draw(int number) {
		
		for(int i=1;i<=number;i++) {						
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
