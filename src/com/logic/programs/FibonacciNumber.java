package com.logic.programs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumber {
    //static function to return fibonacci series
    public static List<Integer> generateFibonacciSeries(int noOfNumbers){
        List<Integer> result = new ArrayList<>();
        int a =0;
        int b =1;
        result.add(0);
        if(noOfNumbers<=1)
            return result;
        result.add(1);
        if(noOfNumbers==2)
            return result;

        for(int i=2;i<noOfNumbers;i++){
            result.add(a+b);
            a=result.get(result.size()-2);
            b=result.get(result.size()-1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter how many fibonacci numbers to generate : ");
        try(Scanner sc = new Scanner(System.in)){
            int noOfNumbers = sc.nextInt();
            List<Integer> result = generateFibonacciSeries(noOfNumbers);
            System.out.print("Fibonacci series : ");
            for(Integer num:result){
                System.out.print(num+" ");
            }
        }catch(InputMismatchException ex){
            System.out.println("Enter positive numbers only.");
        }
    }
}
