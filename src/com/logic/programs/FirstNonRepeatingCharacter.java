package com.logic.programs;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

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

    //function to return first non-repeating character of a string.
    public static char getFirstNonRepeatingChar(String inputString){
        String sanitizedString = sanitizeInputString(inputString);
        char[] sanitizedStringCharArray = sanitizedString.toCharArray();
        char result = '\0';
        int counter = 0;
        for(char ch : sanitizedStringCharArray){
            counter = 0;
            for(int i=0;i<sanitizedString.length();i++){
                if(ch == sanitizedString.charAt(i)){
                    counter++;
                }
            }
            if(counter == 1) {
                result = ch;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Please enter string to get first non repeating character: ");
        try(Scanner sca = new Scanner(System.in)){
            String inputString = sca.nextLine();
            System.out.printf("First non repeating character of %s is %s",inputString,getFirstNonRepeatingChar(inputString));
        }
    }
}
