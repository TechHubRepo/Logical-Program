package com.techhub.lp;

/**
 ==================================================================================================
 Program #58 : Write a program to get the Ordinal number as following.
 --------------------------------------------------------------------------------------------------

 1 = 1st
 2 = 2nd
 3 = 3rd
 7 = 7th
 51 = 51st

 ==================================================================================================
*/
public class P58 {

	private static final String[] ORDINALS = {"th","st","nd","rd"};

	public static void main(String[] args) throws Exception {
		System.out.println("1 =" + getOrdinal(1));
		System.out.println("2 =" + getOrdinal(2));
		System.out.println("3 =" + getOrdinal(3));
		System.out.println("7 =" + getOrdinal(7));
		System.out.println("11 =" + getOrdinal(11));
		System.out.println("12 =" + getOrdinal(12));
		System.out.println("13 =" + getOrdinal(13));
		System.out.println("19 =" + getOrdinal(19));
		System.out.println("51 =" + getOrdinal(51));
		System.out.println("52 =" + getOrdinal(52));
		System.out.println("53 =" + getOrdinal(53));
		System.out.println("57 =" + getOrdinal(57));
		System.out.println("71 =" + getOrdinal(71));
		System.out.println("72 =" + getOrdinal(72));
		System.out.println("73 =" + getOrdinal(73));
		System.out.println("74 =" + getOrdinal(74));
		System.out.println("97 =" + getOrdinal(97));
	}

	private static String getOrdinal(int number){

		String ordinal;
		if(number>=0 && number<=3){
			ordinal = number+ORDINALS[number];
		}else if(number>3 && number<21){
			ordinal = number+ORDINALS[0];
		}else{
			int r = number%10;
			if(r<=3){
				ordinal = number+ORDINALS[r];
			}else{
				ordinal = number+ORDINALS[0];
			}
		}
		return ordinal;
	}
}