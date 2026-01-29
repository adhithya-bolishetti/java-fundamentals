package com.stschool.java.programs.level5;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary Code");
        int binary = sc.nextInt();

        int decimal = 0, base = 1;
        while (binary > 0) {
            int rem = binary % 10;
            decimal += rem * base;
            binary /= 10;
            base *= 2;
        }

        System.out.println("Decimal Number : " + decimal);
        sc.close();
    }
}
