package com.techhub.lp;

/**
 ==================================================================================================
 Program #61

 Array = [1,1,2,2,2,2,3,4,4,4,]

 Output

 [3,1,1,4,4,4,2,2,2,2]

 Explanation:
 3 is 1 Times so comes 1st
 1 is 2 times so comes 2nd
 4 is 3 times so comes 3rd
 so on

 ==================================================================================================
 */
public class P61 {
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,2,3,4,4,4};
		int[] output = new int[arr.length];
		for(int i=0;i< arr.length;i++){
			int count = 0;
			for(int j=0; j<arr.length; j++){
				if(arr[j]==arr[i]){
					count++;
				}
			}
			output[count] = arr[i];
		}

		for(int x=0;x<output.length;x++){
			if(output[x]==0){
				continue;
			}
			for(int y=0; y<x; y++){
				System.out.print(output[x]+",");
			}
		}
	}
}
