package com.stschool.java.fundamentals;

import java.util.Scanner;

public class Factorial {
    public static  int findFactorial(int n) {
        if(n <= 1) return 1;

        return n * findFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();

        if(n < 0) {
            System.out.println("Invalid input");
        }

        int result = findFactorial(n);
        System.out.println("Factorial of " + n + " = " + result);
    }
}
