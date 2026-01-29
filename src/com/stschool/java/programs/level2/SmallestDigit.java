package com.stschool.java.programs.level2;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        int min = Integer.MAX_VALUE;

        while (num != 0) {
            int digit = num % 10;
            if (digit < min) min = digit;
            num /= 10;
        }

        System.out.println("Smallest digit: " + min);

        sc.close();
    }
}
