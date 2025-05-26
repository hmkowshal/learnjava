package com.logic.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigits {

    public static long sumOfDigits(long inputNumber) {
        if (inputNumber < 0) {
            throw new InputMismatchException();
        }

        long sum = 0;
        while (inputNumber > 0) {
            sum += inputNumber % 10;
            inputNumber /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter number to find sum of digits: ");
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLong()) {
                System.out.println("Please enter a valid positive number.");
                return;
            }
            long inputNumber = sc.nextLong();
            if (inputNumber < 0) {
                System.out.println("Please enter positive numbers only.");
                return;
            }

            long sum = sumOfDigits(inputNumber);
            System.out.println("Sum of digits: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Please enter positive numbers only.");
        }
    }
}
