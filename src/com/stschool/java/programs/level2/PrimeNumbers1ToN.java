package com.stschool.java.programs.level2;

import java.util.Scanner;

public class PrimeNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        for (int n = 2; n <= num; n++) {
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) System.out.println(n);
        }

        sc.close();
    }
}
