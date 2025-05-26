package com.logic.programs;


import java.util.Scanner;

public class CountDigits {

    public static int countDigits(int inputNumber) {

        int result=0;
        while(inputNumber!=0){
            inputNumber=inputNumber/10;
            result+=1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Please enter number to count digits : ");
        try(Scanner sc=new Scanner(System.in)){
            if(!sc.hasNextInt()){
                System.out.println("Invalid input , please enter positive numbers only !");
                return;
            }
            int inputNumber=sc.nextInt();
            if (inputNumber <0){
                System.out.println("Invalid input , please enter positive numbers only !");
                return;
            }
            System.out.printf("Number of digits in %d is %d",inputNumber,countDigits(inputNumber));
        }
    }
}
