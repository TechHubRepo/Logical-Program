package com.techhub.lp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
------------------------------------------------------------------------
 Program #42
 Write a program to read a character and display that it is digit or not.
------------------------------------------------------------------------
*/
public class P42 {

	public static void main(String[] args) throws IOException {
		
		Reader reader =  new InputStreamReader(System.in);
		System.out.print("Enter a character : ");

		int ascii = reader.read();
		char c = (char) ascii;

		if(ascii >= 48 && ascii<=57){
			System.out.print(c+" is a digit");
		}else{
			System.out.print(c+" is a not a digit");
		}

		reader.close();
	}
}