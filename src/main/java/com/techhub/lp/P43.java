package com.techhub.lp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 ==================================================================================================
 Program #43 Write a program to read a character and display it is an uppercase or lowercase.
 ==================================================================================================
*/
public class P43 {

	public static void main(String[] args) throws IOException {
		
		Reader reader =  new InputStreamReader(System.in);

		System.out.print("Enter a character : ");
		int ascii = reader.read();
		char c = (char) ascii;

		if(ascii >= 65 && ascii <= 90){
			System.out.print(c+" is Uppercase");
		}else if(ascii >= 97 && ascii <= 122){
			System.out.print(c+" is Lowercase");
		}else{
			System.out.print(c+" is not Uppercase/Lowercase");
		}
		reader.close();
	}
}