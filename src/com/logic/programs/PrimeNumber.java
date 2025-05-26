package com.logic.programs;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int inputNumber) {
        if(inputNumber <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(inputNumber); i++) {
            if(inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is a prime number: ");
        try(Scanner sc = new Scanner(System.in)) {
            if(!sc.hasNext()) {
                System.out.println("Invalid input, please enter positive numbers only.");
                return;
            }
            int inputNumber = sc.nextInt();
            System.out.printf("Entered number : %d is %s prime number",inputNumber,isPrime(inputNumber)?"a":"not a");
        }
    }
}
