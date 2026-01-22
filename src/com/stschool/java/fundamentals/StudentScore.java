package com.stschool.java.fundamentals;
import java.util.*;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mathematics marks : ");
        byte mathMarks = sc.nextByte();

        System.out.println("Enter Science marks : ");
        byte scienceMarks = sc.nextByte();

        System.out.println("Enter English marks");
        byte englishMarks = sc.nextByte();

        System.out.println("Enter Telugu marks");
        byte teluguMarks = sc.nextByte();

        System.out.println("Enter Hindi marks");
        byte hindiMarks = sc.nextByte();

        System.out.println("Enter Social marks");
        byte socialMarks = sc.nextByte();

        float totalMarks;
        totalMarks = ( float ) ( mathMarks + scienceMarks + englishMarks + teluguMarks + hindiMarks + socialMarks );
        System.out.println("Total Marks : " + totalMarks);

        float average;
        average = totalMarks / 6;
        System.out.println("Average : " + average);

        sc.close();
    }
}
