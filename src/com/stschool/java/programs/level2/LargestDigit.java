package com.stschool.java.programs.level2;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        int max = Integer.MIN_VALUE;

        while (num != 0) {
            int digit = num % 10;
            if (digit > max) max = digit;
            num /= 10;
        }

        System.out.println("Largest digit: " + max);

        sc.close();

    }
}
