package com.stschool.java.fundamentals;

import java.util.Scanner;

public class DataTypeConversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        long n2 = sc.nextLong();
        long n3 = sc.nextLong();
        double n4 = sc.nextDouble();
        int n5 = sc.nextInt();
        char c = sc.next().charAt(0);

        System.out.println((float) n1);
        System.out.println((float) n2);
        System.out.println((double) n3);
        System.out.println((long) n4);
        System.out.println((char) n5);
        System.out.println((float) c);

        sc.close();
    }
}
