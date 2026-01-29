package com.stschool.java.programs.level5;

import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        while(n != 0) {
            int rem = n % 10;

            if(rem > largest) {
                secondLargest = largest;
                largest = rem;
            } else if (rem > secondLargest) {
                secondLargest = rem;
            }

            n /= 10;
        }

        System.out.print("Second Largest digit : " + secondLargest);
        sc.close();
    }
}
