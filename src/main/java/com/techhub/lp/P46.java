package com.techhub.lp;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 ==================================================================================================
 Program #46 Write a program convert character into upper case and lowercase without using builtin
 function.
 ==================================================================================================
*/
public class P46 {

	public static void main(String[] args) throws IOException {

		Reader reader =  new InputStreamReader(System.in);
		System.out.print("Enter a character : ");
		char c = (char) reader.read();

		System.out.println("Lower Case = "+toLowerCase(c));
		System.out.println("Upper Case = "+toUpperCase(c));

		reader.close();
	}

	private static char toUpperCase(char c){
		int ascii = c;
		if(ascii >= 97 && ascii <= 122){
			ascii-=32;
		}
		return (char)ascii;
	}

	private static char toLowerCase(char c){
		int ascii = c;
		if(ascii >= 65 && ascii <= 90){
			ascii+=32;
		}
		return (char)ascii;
	}

}