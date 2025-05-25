package com.logic.programs;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumber {
    public static BigInteger reverseNum(BigInteger numInput) {
        if (numInput.compareTo(BigInteger.ZERO) < 0) {
            throw new InputMismatchException();
        }
        StringBuilder inputNumString = new StringBuilder(numInput.toString());
        String reverseNumString = inputNumString.reverse().toString();
        return new BigInteger(reverseNumString);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number to reverse: ");
        try(Scanner sc = new Scanner(System.in)) {
            BigInteger numInput = sc.nextBigInteger();
            BigInteger reverseNum = reverseNum(numInput);
            System.out.print("Reversed number is : "+reverseNum);
        }catch(InputMismatchException e) {
            System.out.println("Please enter positive numbers only.");
        }
    }
}
