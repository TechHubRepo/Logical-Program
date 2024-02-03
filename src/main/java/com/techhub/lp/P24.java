package com.techhub.lp;

/**
--------------------------------------------------
Remove all the white-spaces from String.

Example :  Hello world welcome to java -> Helloworldwelcometojava
---------------------------------------------------
*/
public class P24 {

	public static void main(String[] args) {
		removeWhiteSpace("Hello world welcome to java");
	}

	public static void removeWhiteSpace(String s1) {
		char[] array = s1.toCharArray();
		int idx = array.length;		
		for (int i = 0; i < array.length; i++) {
			char c1 = array[i];
			if(c1==' ' || c1 == '\t') {
				for(int j=i+1; j<idx;j++) {
					array[j-1] = array[j];
					array[j]= ' ';
				}
				idx--;
			}
		}
		System.out.println(new String(array));
	}
}
