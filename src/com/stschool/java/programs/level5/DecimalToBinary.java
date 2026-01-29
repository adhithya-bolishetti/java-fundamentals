package com.stschool.java.programs.level5;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        String binary = "";

        while(n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n /= 2;
        }

        System.out.println("Binary Format : " + binary);

        sc.close();
    }
}
