package com.stschool.java.arraylist;

import java.util.Scanner;

public class InputUtil {

    static Scanner scanner = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }

    public static char getChar(String msg) {
        System.out.println(msg);
        return scanner.next().charAt(0);
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scanner.next();
    }

    public static double getDouble(String msg) {
        System.out.println(msg);
        return scanner.nextDouble();
    }

}
