package com.techhub.lp;

/**
 ==================================================================================================
 Program #59 : Write a program to get the diagonal elements of square matrix
 --------------------------------------------------------------------------------------------------
 Input

 [
 01 02 03 04
 05 06 07 08
 09 10 11 12
 13 14 15 16
 ]

 Output

 1 6 11 16
 4 7 10 13

 ==================================================================================================
*/
public class P59 {

	public static void main(String[] args) throws Exception {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printDiagonal(matrix);
	}

	private static void printDiagonal(int[][] matrix){
		StringBuilder line1 = new StringBuilder();
		StringBuilder line2 = new StringBuilder();
		int size = matrix.length;
		for(int i = 0; i < size; i++){
			line1.append(matrix[i][i]).append(" ");
			line2.append(matrix[i][size-i-1]).append(" ");
		}
		System.out.println(line1);
		System.out.println(line2);
	}
}