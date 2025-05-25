package com.logic.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimNumber {
    //Static function to find if a number is prime
    public static boolean checkIfPrime(int inputNumber){
        if(inputNumber<1)
            return false;
        if(inputNumber==1)
            return false;
        if(inputNumber==2)
            return true;
        for(int i=2;i<inputNumber;i++){
            if(inputNumber%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Please enter number to check if it is a prime number : ");
        try(Scanner sc = new Scanner(System.in)){
            int inputNumber = sc.nextInt();
            System.out.printf("The number %d is %s prime number",inputNumber,checkIfPrime(inputNumber)?"a":"not a");
        }catch(InputMismatchException ex){
            System.out.println("Please enter positive numbers only.");
        }
    }
}
