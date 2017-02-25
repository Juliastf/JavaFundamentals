package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 27.01.2017.
 */
public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(inputLine[j]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int[][] result = new int[3][3];
        int indexRow = 0;
        int indexCol = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.printf("Sum = %d\n", maxSum);
        for (int i = indexRow; i <=indexRow+2 ; i++) {
            for (int j = indexCol; j <=indexCol+2; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


}

