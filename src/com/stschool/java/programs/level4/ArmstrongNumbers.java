package com.stschool.java.programs.level4;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int n = sc.nextInt();

        for (int num = 1; num <= n; num++) {
            int temp = num, sum = 0;
            int digits = (int) Math.log10(num) + 1;

            while (temp != 0) {
                int d = temp % 10;
                sum += (int) Math.pow(d, digits);
                temp /= 10;
            }

            if (sum == num)
                System.out.print(num + " ");
        }
    }
}
