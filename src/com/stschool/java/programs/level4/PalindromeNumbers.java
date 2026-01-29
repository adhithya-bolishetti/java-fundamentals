package com.stschool.java.programs.level4;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int n = sc.nextInt();

        for (int num = 1; num <= n; num++) {
            int temp = num, rev = 0;

            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            if (rev == num)
                System.out.print(num + " ");
        }
    }
}
