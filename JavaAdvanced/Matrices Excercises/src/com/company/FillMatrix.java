package com.company;

import java.util.Scanner;

public class FillMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);

        if (input[1].equals("A")) {
            int[][] matrixA = fillMatrixA(n);
            for (int[] ints : matrixA) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }

        } else if (input[1].equals("B")) {
            int[][] matrixB = fillMatrixB(n);
            for (int[] ints : matrixB) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();

            }

        }


    }

    private static int[][] fillMatrixB(int n) {
        int[][] matrixB = new int[n][n];
        int number = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrixB[j][i] = number;
                    number++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    matrixB[j][i] = number;
                    number++;
                }
            }
        }
        return matrixB;
    }

    private static int[][] fillMatrixA(int n) {
        int[][] matrixA = new int[n][n];
        int number = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[j][i] = number;
                number++;
            }
        }
        return matrixA;
    }
}
