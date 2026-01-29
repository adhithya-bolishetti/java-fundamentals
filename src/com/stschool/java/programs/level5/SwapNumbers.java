package com.stschool.java.programs.level5;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Numbers before swapping : " + "a : " + a + ", b : " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Numbers after swapping : " + "a : " + a + ", b : " + b);

        sc.close();
    }
}
