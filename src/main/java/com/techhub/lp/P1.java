package com.techhub.lp;

/**
 ----------------------------------------------
 Write a program to drew the following pattern.
 ----------------------------------------------
 
 ********
 ********
 ********
 ********
 ********
 
 ----------------------------------------------
 */
public class P1 {
	
	public static void main(String[] args) {
		draw(5);
	}
	
	private static void draw(int number) {
		
		for(int i=1;i<=number;i++) {
			for(int j=0;j<=number;j++) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}
