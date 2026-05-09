package com.stschool.java.fundamentals;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();

        if(n <= 1) {
            System.out.println(n + " is a non-prime number");
        }

        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n % i == 0) {
                System.out.println(n + " is a non-prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");
    }
}
