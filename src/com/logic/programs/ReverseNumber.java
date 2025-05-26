package com.logic.programs;


import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int inputNumber) {
        String inputNumberString = String.valueOf(inputNumber);
        String reversedString = "";

        for (int i = inputNumberString.length() - 1; i >= 0; i--) {
            reversedString += inputNumberString.charAt(i);
        }
        return Integer.parseInt(reversedString);
    }

    public static void main(String[] args) {
        System.out.print("Please enter a number to reverse : ");
        try(Scanner scanner = new Scanner(System.in)) {
            if(!scanner.hasNextInt()) {
                System.out.print("Invalid input, please enter positive numbers only.");
                return;
            }
            int inputNumber = scanner.nextInt();
            if(inputNumber < 0) {
                System.out.print("Invalid input, please enter positive numbers only.");
                return;
            }
            System.out.printf("Reverse of entered number %d is %d.\n", inputNumber, reverseNumber(inputNumber));
        }
    }
}
