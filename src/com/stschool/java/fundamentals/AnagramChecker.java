package com.stschool.java.fundamentals;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        String str2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("Not Anagrams");
                return;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        if (map.isEmpty()) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
