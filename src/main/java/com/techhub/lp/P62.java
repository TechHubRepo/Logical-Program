package com.techhub.lp;

/**
 ==================================================================================================
 Program #62

 Array = {11,12,13,41,111}
 Find how many 1's are there

 ==================================================================================================
 */
public class P62 {
	
	public static void main(String[] args) {
		int[] arr = {11,12,13,41,111};

		int count =0;
		for(int e: arr){

			String s = String.valueOf(e);
			char[] ca = s.toCharArray();

			for(char c:ca){
				if(c == '1'){
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
