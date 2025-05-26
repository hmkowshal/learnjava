package com.logic.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmStrong {
    //function to check for n-value armstrong numbers
    public static boolean isArmStrong(int inputNumber) throws InputMismatchException {

        int originalNumber = inputNumber;
        int noOfDigits = String.valueOf(inputNumber).length();
        int result=0;

        while(inputNumber!=0){
            int remainder = inputNumber % 10;
            inputNumber = inputNumber / 10;
            result+=(int)Math.pow(remainder,noOfDigits);
        }
        return result == originalNumber;
    }


    public static void main(String[] args) {
        System.out.print("Please enter a number to check if its Armstrong number : ");
        try(Scanner sc = new Scanner(System.in)) {
            if(!sc.hasNextInt()){
                System.out.print("Invalid input ! Please enter a valid positive number only.");
                return;
            }
            int inputNumber = sc.nextInt();
            if(inputNumber<0) {
                System.out.print("Invalid input ! Please enter a valid positive number only.");
                return;
            }
            System.out.printf("Entered number : %d is %s Armstrong number",inputNumber,isArmStrong(inputNumber)?"an":"not an");
        }catch(InputMismatchException e){
            System.out.println("Please enter postive numbers only.");
        }
    }
}
