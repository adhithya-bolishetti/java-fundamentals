package com.stschool.java.programs.level2;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) isPrime = false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }

        sc.close();
    }
}
