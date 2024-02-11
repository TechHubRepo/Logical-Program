package com.techhub.lp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
------------------------------------------------------------------------
 Write a program to read year and display that it is leap year of not.
 Note : If year is divisible by 4 then it is leap year.
------------------------------------------------------------------------
*/
public class P48 {

	public static void main(String[] args) throws IOException {

		Reader reader =  new InputStreamReader(System.in);
		System.out.print("Enter a character : ");
		char c = (char) reader.read();

		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
				c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
			System.out.println(c +" is vowel");
		}else{
			System.out.println(c+" is consonant");
		}

		reader.close();
	}
}