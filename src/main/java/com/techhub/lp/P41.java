package com.techhub.lp;

import java.util.Arrays;
import java.util.Scanner;

/**
------------------------------------------------------------------------
 Write a program to find Longest Arithmetic Progression

------------------------------------------------------------------------
*/
public class P41 {

	public static void main(String[] args) {

		findLLAP(new int[]{1, 7, 10, 15, 27, 29});
		findLLAP(new int[]{5, 10, 15, 20, 25, 30});
		findLLAP(new int[]{1, 3, 8, 9, 11});
		findLLAP(new int[]{1, 3, 5, 9, 11});
	}

	public static void findLLAP(int[] arr){

		int[] nums = new int[arr.length];


		int outerItr = 1;
		int n1 = arr[0];
		nums[0] = n1;
		int lapCount = 2;
		while(outerItr < arr.length){

			int n2 = arr[outerItr];
			int diff = n2 - n1;
			int nextNum = n2 + diff;
			nums[1] = n2;
			int numIdx = 2;
			for(int i=outerItr; i<arr.length; i++){
				int cn = arr[i];
				if(cn==nextNum){
					nums[numIdx] = cn;
					nextNum = cn + diff;
					numIdx++;
				}
			}

			if(numIdx>2){
				lapCount=numIdx;
				break;
			}

			outerItr++;
		}

		System.out.println("-----------------------------");
		System.out.println(Arrays.toString(nums));
		System.out.println(lapCount);
	}
}