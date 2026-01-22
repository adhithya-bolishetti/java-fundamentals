package com.stschool.java.fundamentals;
import java.util.*;

public class ArithmeticOperations {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1 :");
        byte num1 = sc.nextByte();

        System.out.println("Enter num 2 :");
        byte num2 = sc.nextByte();

        short res = ( short )( num1 + num2 );

        System.out.println("Final result is : " + res);

        sc.close();
    }
}
