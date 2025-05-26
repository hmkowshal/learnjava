package com.logic.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palndrome {
    public static boolean isPalindrome(int inputNumber) {
        String inputNumberString = String.valueOf(inputNumber);
        String reversedString = "";

        for(int i=inputNumberString.length()-1;i>=0;i--){
            reversedString+=inputNumberString.charAt(i);
        }
        return inputNumberString.equals(reversedString);
    }

    public static void main(String[] args) {
        System.out.print("Please enter a number to check for palindrome : ");
        try(Scanner scanner = new Scanner(System.in)) {
            if(!scanner.hasNextInt()) {
                System.out.print("Invalid input, please enter positive numbers only.");
                return;
            }
            int number = scanner.nextInt();
            if(number<0){
                System.out.print("Invalid input, please enter positive numbers only.");
                return;
            }
            System.out.printf("Entered number : %d , is %s palindrome.", number, isPalindrome(number)?"a":"not a");
        }
    }
}
