package com.logic.programs;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmStrong {
    public static boolean isArmStrong(BigInteger inputNumber) {
        BigInteger originalNumber = inputNumber;
        if(inputNumber.compareTo(BigInteger.ZERO) < 0){
            throw new InputMismatchException();
        }

        BigInteger result = BigInteger.ZERO;
        BigInteger quotient = BigInteger.ZERO;
        BigInteger remainder = BigInteger.ZERO;
        while(inputNumber.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divRem = inputNumber.divideAndRemainder(new BigInteger("10"));
            quotient = divRem[0];
            remainder = divRem[1];
            result = result.add(remainder.pow(3));
            inputNumber = quotient;
        }
        return result.equals(originalNumber);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number to find if its an armstron number : ");
        try(Scanner sc = new Scanner(System.in)) {
            BigInteger inputNumber = sc.nextBigInteger();
            System.out.printf("Entered number : %s is %s Armstrong Number",inputNumber,isArmStrong(inputNumber)?"a":"not a");
        }catch (InputMismatchException e){
            System.out.println("Please enter positive numbers only.");
        }
    }
}
