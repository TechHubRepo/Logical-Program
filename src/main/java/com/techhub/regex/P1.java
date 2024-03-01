package com.techhub.regex;

/**
 ------------------------------------------------------------
 Program #1
 Write a program to validate PAN number.
 ------------------------------------------------------------
 ABCDE1234Z Valid PAN
 RFDGDR12DC Invalid PAN
 ------------------------------------------------------------
 */
public class P1 {

    /** The PAN Regular Expression */
    private static final String PAN_REGEX = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

    public static void main(String[] args) {
        String[] pans = {"ABCDE1234Z","RFDGDR12DC"};

        for(String pan: pans){
            if(validatePAN(pan)){
                System.out.println(pan+" Valid PAN");
            }else{
                System.err.println(pan+" Invalid PAN");
            }
        }
    }

    private static boolean validatePAN(String pan){
        return pan.matches(PAN_REGEX);
    }
}
