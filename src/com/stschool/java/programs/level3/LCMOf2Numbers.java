package com.stschool.java.programs.level3;

import java.util.Scanner;

public class LCMOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = Math.max(a, b);

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM: " + lcm);
                break;
            }
            lcm++;
        }

        sc.close();
    }
}
