package com.stschool.java.programs.level4;

import java.util.Scanner;

public class EvenSumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int sum = 0, temp = i;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum % 2 == 0)
                System.out.print(i + " ");
        }

        sc.close();
    }
}
