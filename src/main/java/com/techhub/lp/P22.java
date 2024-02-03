package com.techhub.lp;

import java.util.Arrays;

/**
--------------------------------------------------
Remove duplicate element from array.

Example :	[5,9,6,5,9,2,5] -> [5,9,6,2]

			[11,19,6,9,9,11,19,11,5,5,3] -> [11, 19, 6, 9, 5, 3, 0, 0, 0, 0, 0]
---------------------------------------------------
*/
public class P22 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicate(new int[]{5,9,6,5,9,2,5})));
		System.out.println(Arrays.toString(removeDuplicate(new int[]{11,19,6,9,9,11,19,11,5,5,3})));
	}

	public static int[] removeDuplicate(int[] arr) {
		int idx = arr.length-1;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j]=0;
					for(int k = j+1; k <= idx; k++) {
						arr[k-1] = arr[k];
						arr[k] = 0;
					}
					idx--;
				}
			}
		}
		return arr;
	}
}
