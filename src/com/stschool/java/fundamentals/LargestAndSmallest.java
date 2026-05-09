package com.stschool.java.fundamentals;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            smallest = Math.min(smallest, arr[i]);
            largest = Math.max(largest, arr[i]);
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
