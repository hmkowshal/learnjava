package com.logic.programs;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountDigits {
    public static BigInteger countDigits(BigInteger inputNumber) {
        if(inputNumber.compareTo(BigInteger.ZERO)<0) {
            throw new InputMismatchException();
        }
        BigInteger count = BigInteger.ZERO;
        while(inputNumber.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] result = inputNumber.divideAndRemainder(BigInteger.TEN);
            count = count.add(BigInteger.ONE);
            inputNumber = result[0];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter number to count its digits : ");
        try(Scanner sc = new Scanner(System.in)) {
            BigInteger inputNumber = sc.nextBigInteger();
            BigInteger count = countDigits(inputNumber);
            System.out.print("Number of digits is : "+count);
        }catch (InputMismatchException e) {
            System.out.print("Please enter positive numbers only.");
        }
    }
}
