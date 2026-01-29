package com.stschool.java.programs.level1;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while(num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }

        sc.close();
    }
}
