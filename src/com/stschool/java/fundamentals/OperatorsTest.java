package com.stschool.java.fundamentals;

public class OperatorsTest {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int res = n1++ - --n2 + n2-- * ++n1 + --n1;
        System.out.println(res);

        n1 = 10;
        n2 = 20;
        res = n1 + n2 - 30 * 40 / 50 % 60;
        System.out.println(res);

        n1 = 10;
        n2 = 20;
        res = n1 + (n2 - 30) * 40 / 50 % 60;
        System.out.println(res);

        n1 = 10;
        System.out.println(n1++ > 10 && ++n1 > 5);
        System.out.println(n1);
    }
}
