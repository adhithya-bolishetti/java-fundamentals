package com.stschool.java.programs.level5;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range");
        int n = sc.nextInt();

        System.out.println("Enter numbers");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int total = (n + 1) * (n + 2) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        System.out.println("Missing number : " + (total - sum));
        sc.close();
    }
}
