package com.stschool.java.programs.patterns;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char)(j+65));
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j > 0; j--) {
                if(i == 0 && j == n) continue ;
                System.out.print((char)(j+64));
            }
            System.out.println();
        }

        sc.close();
    }
}
