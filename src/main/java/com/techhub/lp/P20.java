package com.techhub.lp;


/**
---------------------------------------------------------------------------------------------------
Program #20
Check if two given String are Anagram of each other or not.

Two Strings are Anagram to each other if they has same length and same character but the order of 
them are different and you can ignore cases.
---------------------------------------------------------------------------------------------------
*/
public class P20 {

	public static void main(String[] args) {		
		isAnagram("listen","silent");		
		isAnagram("RAM","SAM");
		isAnagram("RAM","MAR");
		isAnagram("jYoTI","YJTOI");
	}

	private static void isAnagram(String s1,String s2) {
		
		boolean flag = true;
		char arr1[] = s1.toLowerCase().toCharArray();
		char arr2[] = s2.toLowerCase().toCharArray();
		
		if(s1.length()==s2.length()) {
			
			for(int i=0;i<arr1.length;i++) {
				
				char c = arr1[i];
				
				int count = 0;	
				for(int j=0;j<arr1.length;j++) {
					char c2 = arr1[j];
					if(c==c2) {
						count++;
					}
				}
				
				int count2=0;
				for(int k=0;k<arr2.length;k++) {
					char c3 = arr2[k];
					if(c3==c) {
						count2++;
					}
				}
				
				if(count!=count2) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		
		if(flag) {
			System.out.println(s1 +" and "+s2 + " are anagram (TRUE)");
		} else {
			System.err.println(s1 +" and "+s2 + " are not anagram (FALSE)");
		}
	}
}
