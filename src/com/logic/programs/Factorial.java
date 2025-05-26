package com.logic.programs;

import java.util.Scanner;

public class Factorial {
   public static int getFactorial(int inputNumber){
       int result = 1;

       if(inputNumber == 0 || inputNumber ==1){
           return result;
       }

       while(inputNumber > 0){
           result*=inputNumber;
           inputNumber--;
       }
       return result;
   }

    public static void main(String[] args) {
        System.out.print("Please enter number to get factorial : ");
        try(Scanner sc = new Scanner(System.in)){
            if(!sc.hasNextInt()){
                System.out.print("Invalid input, please enter a positive numbers only.");
                return;
            }
            int inputNumber = sc.nextInt();
            if(inputNumber<0){
                System.out.print("Invalid input, please enter a positive numbers only.");
                return;
            }
            System.out.printf("Factorial of %d is %d\n", inputNumber, getFactorial(inputNumber));
        }
    }


}
