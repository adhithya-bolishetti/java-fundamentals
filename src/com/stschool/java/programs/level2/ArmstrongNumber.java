package com.stschool.java.programs.level2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;
        int digits = (int) Math.log10(num) + 1;
        int sum = 0;

        while(num != 0) {
            int rem = num % 10;
            sum += (int) Math.pow(rem, digits);
            num /= 10;
        }

        if(sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}
