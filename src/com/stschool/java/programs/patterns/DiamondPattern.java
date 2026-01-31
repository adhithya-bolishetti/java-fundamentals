package com.stschool.java.programs.patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i <= n / 2) {
                for (int j = 0; j < n / 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = n / 2; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
