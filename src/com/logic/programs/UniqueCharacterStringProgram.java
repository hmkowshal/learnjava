package com.logic.programs;

import java.util.Scanner;

public class UniqueCharacterStringProgram {
    //Function to sanitize string - remove spaces , spacial characters
    public static String sanitizeInputString(String inputString){
        String tempString = inputString.toLowerCase().trim();
        String sanitizedString = "";

        for(int i=0;i<tempString.length();i++){
            if(tempString.charAt(i)>='a' && tempString.charAt(i)<='z'){
                sanitizedString += tempString.charAt(i);
            }
        }
        return sanitizedString;
    }

    //Function to check if a character is in string
    public static boolean isInString(String inputString,char ch){
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }

    //function to compare each character in sanitized string against every character to determine duplicates
    public static String getUniqueString(String inputString) {
        String sanitizedString = sanitizeInputString(inputString);
        char[] sanitizedCharArray = sanitizedString.toCharArray();
        String returnString = "";

        for (char ch : sanitizedCharArray) {
            if(!isInString(returnString, ch)){
                returnString+=ch;
            }
        }
        return returnString;
    }

    public static void main(String[] args) {

        System.out.print("Please enter string to get unique character string: ");
        try(Scanner sca = new Scanner(System.in)){
            String inputString = sca.nextLine();
            System.out.println(getUniqueString(inputString));
        }

    }

}
