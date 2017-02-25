package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nikijul on 27.01.2017.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Integer.parseInt(inputLine[j]);
            }
        }

        int sumprimary = 0;
        int sumsecondary=0;
        int primaryDiagonal = 0;
        int secondaryDiagonal = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j1 = 0; j1 < n; j1++) {
                if (j1 == primaryDiagonal) {
                    sumprimary += matrix[i][j1];

                } if (j1 == secondaryDiagonal) {
                    sumsecondary += matrix[i][j1];

                }
            }
            primaryDiagonal++;
            secondaryDiagonal--;
        }


        System.out.println(Math.abs(sumprimary-sumsecondary));


    }
}
