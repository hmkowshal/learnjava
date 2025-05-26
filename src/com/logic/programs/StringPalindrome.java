package com.logic.programs;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String inputString) {
        String reversedString = "";

        for(int i=inputString.length()-1;i>=0;i--){
            reversedString += inputString.charAt(i);
        }
        return inputString.equals(reversedString);
    }

    public static void main(String[] args) {
        System.out.print("Please enter a string to check for palindrome: ");
        try(Scanner sc = new Scanner(System.in)) {
            String inputString = sc.next();
            System.out.printf("Entered string : %s is %s palindrom", inputString, isPalindrome(inputString)?"a":"not a");
        }
    }
}
