package com.stschool.java.fundamentals;

import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = scanner.nextLine();

        String newString = "";

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != ' ') {
                newString += s.charAt(i);
            }
        }

        newString = newString.toLowerCase();

        boolean res = checkPalindrome(newString);

        if(res) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
