package com.stschool.java.programs.patterns;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
