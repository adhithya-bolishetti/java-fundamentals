package com.stschool.java.programs.level5;

import java.util.Scanner;

public class CheckIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int prev = 10;
        boolean isIncreasing = true;

        while (n > 0) {
            int digit = n % 10;

            if (digit > prev) {
                isIncreasing = false;
                break;
            }

            prev = digit;
            n /= 10;
        }

        if (isIncreasing) {
            System.out.println("Digits are in Increasing order");
        } else {
            System.out.println("Digits are not in Increasing order");
        }

        sc.close();
    }
}
