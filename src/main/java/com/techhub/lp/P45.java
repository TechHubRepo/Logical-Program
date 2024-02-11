package com.techhub.lp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
------------------------------------------------------------------------
Write a program to read three subject marks and display the following
 1. Average marks
 2. Total Marks
 3. Grade as per following criteria
 -------------------------------------
 Marks   Grade   Remarks
 -------------------------------------
 >=80      A      Excellent
 >=70      B      Very Good
 >=60      C      Good
 >=50      D      Satisfactory
 <50       E      Failed
 -------------------------------------
------------------------------------------------------------------------
*/
public class P45 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Enter a marks 1 : ");
		int m1 = scanner.nextInt();

		System.out.print("Enter a marks 2 : ");
		int m2 = scanner.nextInt();

		System.out.print("Enter a marks 3 : ");
		int m3 = scanner.nextInt();

		System.out.println("==================================");
		showTotalAndAverageMarks(m1,m2,m3);
		showResultStatus(m1,m2,m3);

		scanner.close();
	}

	private static void showTotalAndAverageMarks(int ... marks){
		int totalMarks = 0;
		for(int mark : marks){
			totalMarks += mark;
		}
		System.out.println("Total Marks : "+totalMarks);
		System.out.println("Average Marks : "+(totalMarks/marks.length));
	}

	private static void showResultStatus(int ... marks){
		for(int mark: marks){

			if(mark>=80){
				System.out.println("Mark = "+mark+" : Grade = A : Remarks = Excellent");
			}else if(mark>=70){
				System.out.println("Mark = "+mark+" : Grade = B : Remarks = Very Good");
			}else if(mark>=60){
				System.out.println("Mark = "+mark+" : Grade = C : Remarks = Good");
			}else if(mark>=50){
				System.out.println("Mark = "+mark+" : Grade = D : Remarks = Satisfactory");
			}else{
				System.out.println("Mark = "+mark+" : Failed");
			}
		}
	}
}