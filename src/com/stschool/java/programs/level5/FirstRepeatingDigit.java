package com.stschool.java.programs.level5;

import java.util.Scanner;

public class FirstRepeatingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int rev = 0;

        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        boolean[] seen = new boolean[10];
        int firstDigit = -1;

        while(rev != 0) {
            int rem = rev % 10;
            if(seen[rem]) {
                firstDigit = rem;
                break;
            }
            seen[rem] = true;
            rev /= 10;
        }

        if (firstDigit == -1) {
            System.out.println("No Repeating digits");
        } else {
            System.out.println("First Repeating digit : " + firstDigit);
        }

        sc.close();
    }
}
