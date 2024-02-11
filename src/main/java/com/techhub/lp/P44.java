package com.techhub.lp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
------------------------------------------------------------------------
 Write a program to read a character and display it is a special symbol or not.
------------------------------------------------------------------------
*/
public class P44 {

	public static void main(String[] args) throws IOException {
		
		Reader reader =  new InputStreamReader(System.in);
		System.out.print("Enter a character : ");
		int ascii = reader.read();
		char c = (char) ascii;

		if(ascii >= 65 && ascii <= 90){
			System.out.print(c+" is an uppercase");
		}else if(ascii >= 97 && ascii <= 122){
			System.out.print(c+" is a lowercase");
		}else if(ascii >= 33 && ascii <= 47){
			System.out.print(c+" is a special symbol");
		}else if(ascii >= 48 && ascii<=57){
			System.out.print(c+" is a digit");
		}else{
			System.out.print(c+" is some other character");
		}

		reader.close();
	}
}