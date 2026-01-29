package com.stschool.java.programs.level5;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean isPower = false;

        while (n > 1) {
            if (n % 2 != 0) {
                isPower = false;
                break;
            }
            n /= 2;
            isPower = true;
        }

        if (isPower) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a Power of 2");
        }

        sc.close();
    }
}
