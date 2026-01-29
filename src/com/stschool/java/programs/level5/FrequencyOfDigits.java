package com.stschool.java.programs.level5;

import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int[] freq = new int[10];

        while(n > 0) {
            int rem = n % 10;
            freq[rem]++;
            n /= 10;
        }

        for(int i=0;i<10;i++) {
            System.out.println(i + " occured " + freq[i] + " times");
        }

        sc.close();
    }
}
