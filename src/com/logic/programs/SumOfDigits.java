package com.logic.programs;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigits {
    public static BigInteger sumOfDigits(BigInteger inputNumber){
        if(inputNumber.compareTo(BigInteger.ZERO) < 0){
            throw new InputMismatchException();
        }
        BigInteger sum = BigInteger.ZERO;
        BigInteger quotient = BigInteger.ZERO;
        BigInteger remainder = BigInteger.ZERO;
        while(inputNumber.compareTo(BigInteger.ZERO)>0){
            BigInteger[] digits = inputNumber.divideAndRemainder(BigInteger.TEN);
            remainder = digits[1];
            sum = sum.add(remainder);
            inputNumber = digits[0];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter number to find sum of digits: ");
        try(Scanner sc = new Scanner(System.in)){
            BigInteger inputNumber = sc.nextBigInteger();
            BigInteger sumOfDigits = sumOfDigits(inputNumber);
            System.out.print("Sum of digits: " + sumOfDigits);
        }catch(InputMismatchException e){
            System.out.println("Please enter positive numbers only.");
        }
    }
}
