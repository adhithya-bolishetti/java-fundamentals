package com.stschool.java.fundamentals;

import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = num; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
