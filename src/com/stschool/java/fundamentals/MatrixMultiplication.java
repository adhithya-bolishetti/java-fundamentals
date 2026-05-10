package com.stschool.java.fundamentals;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row size:");
        int r1 = scanner.nextInt();
        System.out.println("Enter column size:");
        int c1 = scanner.nextInt();

        int[][] A = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter row size:");
        int r2 = scanner.nextInt();
        System.out.println("Enter column size:");
        int c2 = scanner.nextInt();

        int[][] B = new int[r2][c2];

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] C = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("C =");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
