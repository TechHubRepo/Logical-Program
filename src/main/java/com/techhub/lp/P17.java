package com.techhub.lp;

/**
 ==================================================================================================
 Program #17 Write a program to draw the following pattern.
 --------------------------------------------------------------------------------------------------

programmingspark
r              r
o              a
g              p
r              s
a              g
m              n
m              i
i              m
n              m
g              a
s              r
p              g
a              o
r              r
k              p
programmingspark

 ==================================================================================================
*/
public class P17 {
	
	public static void main(String[] args) {
		draw("programmingspark");
	}
	
	private static void draw(String str) {		
		System.out.println(str);
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			char a = arr[i + 1];
			char b = arr[arr.length - 1 - i - 1];
			for (int j = 0; j < arr.length; j++) {
				if (j == 0) {
					System.out.print(a);
				} else if (j == arr.length - 1) {
					System.out.print(b);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println(str);
	}
}
