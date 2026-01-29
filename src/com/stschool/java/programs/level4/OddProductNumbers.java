package com.stschool.java.programs.level4;

import java.util.Scanner;

public class OddProductNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int product = 1, temp = i;

            while (temp != 0) {
                product *= temp % 10;
                temp /= 10;
            }

            if (product % 2 != 0)
                System.out.print(i + " ");
        }

        sc.close();
    }
}
