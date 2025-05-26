package com.logic.programs;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void countVowelsConsonants(String inputString) {
        String vowels = "aeiou";
        char[] inputStringArray = inputString.toLowerCase().toCharArray();
        int vowelCount = 0;
        int consonantCount = 0;
        for(char ch:inputStringArray) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) >= 0) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.printf("Vowel count : %d , Consonant count : %d",vowelCount,consonantCount);
    }

    public static void main(String[] args) {
        System.out.print("Enter string to calculate vowels and consonants : ");
        try(Scanner sc = new Scanner(System.in)) {
            String inputString = sc.nextLine();
            countVowelsConsonants(inputString);
        }
    }
}
