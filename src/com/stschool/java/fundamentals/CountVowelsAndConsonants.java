package com.stschool.java.fundamentals;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = scanner.nextLine();
        s = s.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels++;
            } else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
