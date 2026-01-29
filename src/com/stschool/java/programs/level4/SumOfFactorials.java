package com.stschool.java.programs.level4;

import java.util.Scanner;

public class SumOfFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        System.out.println("Sum of factorial of digits: " + sum);
    }
}
