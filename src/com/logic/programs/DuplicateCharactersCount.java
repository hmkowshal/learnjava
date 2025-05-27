package com.logic.programs;

import java.util.Scanner;

public class DuplicateCharactersCount {

    public static boolean isInUnique(String uniqueString,char ch){
        for(int i=0;i<uniqueString.length();i++){
            if(uniqueString.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }

    // function to sanitize string => convert string to lowercase , remove leading and trailing spaces and any special characters
    public static String sanitizeString(String inputString){
        //convert to lowercase and remove leading and trailing spaces
        inputString = inputString.toLowerCase().trim();
        //new string variable to hold only alphabets from cleaned input string
        String sanitizedString = "";
        //loop to check if every character in the input string is an alphabet and then extract those.
        for(int i=0;i<inputString.length();i++){
            char ch = inputString.charAt(i);
            if((int)ch>=97 && (int) ch<=122){
                sanitizedString += (char)ch;
            }
        }
        //return cleaned string containing only alphabets
        return sanitizedString;
    }

    // function to print duplicate characters in the input string
    public static void printDuplicates(String inputString){
        // get the input string cleaned by removing spaces and special characters
        String sanitizedString = sanitizeString(inputString);
        char[] sanitizedChars = sanitizedString.toCharArray(); // convert to char array for easy looping
        String uniqueCharactersString =""; // to contain unique characters
        int count=0; //variable to track repetition of a character
        //loops ( 2 for loops ) to compare every character in the string with rest of the string
        System.out.println("Duplicate characters if any , will be shown below : ");
        for(char ch:sanitizedChars){
            count=0;
            for (int j=0;j<sanitizedString.length();j++){
                if(ch==sanitizedString.charAt(j)){
                    count++;
                }
            }
            //if a character had repeated more than once - print it with its repitition count
            if(count>1){
                //check if the character already exists in unique string; if not add them to unique string and print
                if(!isInUnique(uniqueCharactersString,ch)){
                    uniqueCharactersString+=ch;
                    System.out.printf("%s is repeated %d times.\n",ch,count);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Please enter a string to check for duplicates : ");
        try(Scanner sc = new Scanner(System.in)){
            String inputString = sc.nextLine();
            printDuplicates(inputString);
        }
    }
}
