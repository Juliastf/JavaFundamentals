package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 25.01.2017.
 */
public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            String[] temp = scanner.nextLine().split(", ");
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Integer.parseInt(temp[j]);
            }
        }
        int maxSum = -100000;
        int startIndexRow = 0;
        int startIndexCol = 0;

        for (int i = 0; i < rows - 1; i++) {

            for (int j = 0; j < columns - 1; j++) {
                int checkSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (checkSum > maxSum) {
                    maxSum = checkSum;
                    startIndexRow = i;
                    startIndexCol = j;
                }

            }
        }

        System.out.println(matrix[startIndexRow][startIndexCol] + " " + matrix[startIndexRow][startIndexCol + 1]);
        System.out.println(matrix[startIndexRow + 1][startIndexCol] + " " + matrix[startIndexRow + 1][startIndexCol + 1]);
        System.out.println(maxSum);

    }
}

