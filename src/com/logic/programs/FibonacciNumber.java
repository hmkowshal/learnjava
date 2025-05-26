package com.logic.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumber {

    public static int[] fibonacciNumber(int number) {
        if (number <= 0) {
            return new int[0]; // Return empty array for invalid input
        }

        int[] series = new int[number];
        series[0] = 0;

        if (number == 1) {
            return series;
        }

        series[1] = 1;

        for (int i = 2; i < number; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of fibonacci series to be generated : ");
        try(Scanner sc = new Scanner(System.in)) {
            if(!sc.hasNextInt()) {
                System.out.print("Invalid input , please enter a positive number");
                return;
            }
            int n = sc.nextInt();
            System.out.print("Fibonacci series are: "+Arrays.toString(fibonacciNumber(n)));
        }
    }
}
