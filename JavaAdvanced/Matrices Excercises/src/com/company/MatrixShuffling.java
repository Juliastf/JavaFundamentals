package com.company;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixParameters = scanner.nextLine().split(" ");
        int n = Integer.parseInt(matrixParameters[0]);
        int m = Integer.parseInt(matrixParameters[1]);
        String[][] matrix = new String[n][m];

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = inputLine[j];
            }
        }

        String command = scanner.nextLine();
        String holder= "";


        while (!command.equals("END")) {
            try {
                String[] input = command.split(" ");
                holder = matrix[Integer.parseInt(input[1])][Integer.parseInt(input[2])];
                matrix[Integer.parseInt(input[1])][Integer.parseInt(input[2])] = matrix[Integer.parseInt(input[3])][Integer.parseInt(input[4])];
                matrix[Integer.parseInt(input[3])][Integer.parseInt(input[4])] = holder;
                for (String[] chars : matrix) {
                    for (String c : chars) {
                        System.out.print(c + " ");
                    }
                    System.out.println();
                }

                command = scanner.nextLine();

            } catch (IndexOutOfBoundsException | NumberFormatException ex) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();

            }
        }

    }
}
