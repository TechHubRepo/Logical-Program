package com.techhub.regex;

/**
 ==================================================================================================
 Program #2 : Write a program that will validate the string as following
 --------------------------------------------------------------------------------------------------

 First 4 characters can be from A,B,C,D,E,F,G,H,I,J.
 Next 3 Character can be any character.
 Last 2 Characters can be from t,u,v,w,x,y,z

 EFGHUb1tz is valid
 JJIF253wv is valid

 ==================================================================================================
 */
public class P2 {

    private static final String REGEX = "[A-J]{4}.{3}[t-z]{2}";

    public static void main(String[] args) {
        String[] inputs = {"EFGHUb1tz","JJIF253wv","ABCDE1234Z","HHHH111zz","KLMN*&8wy","BJDH*&8wy"};

        for(String input: inputs){
            if(validate(input)){
                System.out.println(input+" Valid");
            }else{
                System.err.println(input+" Invalid");
            }
        }
    }

    private static boolean validate(String input){
        return input.matches(REGEX);
    }
}
