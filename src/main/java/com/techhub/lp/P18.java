package com.techhub.lp;

import java.util.Arrays;

/**
----------------------------------------------
 Program #18
 Write a program to find the indexes of an array of number who sum is equals to
 given target number.
----------------------------------------------

	Input  : [5, 10, 20, 40]
	Target : 30
	Output : [2, 3]
	   
	Input  : [30, 10, 5, 9, 3, 2, 8]
	Target : 5
	Output : [5, 6]

----------------------------------------------
*/
public class P18 {
	
	public static void main(String[] args) {
		test(new int[]{5,10,20,40},30,new int[]{2,3});
		test(new int[]{30,10,5,9,3,2,8},5,new int[]{5,6});
	}
	
	private static int[] findTarget(int[] input, int target) {		
		int[] output = { 0, 0 };
		boolean flag = false;
		for (int i = 0; i < input.length; i++) {
			int a = input[i];
			for (int j = 0; j < input.length; j++) {
				if (i != j) {
					int b = input[j];
					if (a + b == target) {
						output[0] = i+1;
						output[1] = j+1;
						flag = true;
						break;
					}
				}
			}
			if (flag) {
				break;
			}
		}
		return output;
	}
	
	public static void test(int[] input, int target, int[] output) {
		System.out.println("--------------------------------------");
		int result[] = findTarget(input,target);		
		if(Arrays.equals(output, result)) {
			System.out.println("Test Case Passed");
			System.out.println("\tInput  : "+Arrays.toString(input));
			System.out.println("\tOutput : "+Arrays.toString(result));
			System.out.println("\tTarget : "+target);
		} else {
			System.err.println("Test Case Failed");
			System.err.println("\tInput  : "+Arrays.toString(input));
			System.err.println("\tOutput : "+Arrays.toString(result));
			System.err.println("\tTarget : "+target);
		}
		
	}
}
