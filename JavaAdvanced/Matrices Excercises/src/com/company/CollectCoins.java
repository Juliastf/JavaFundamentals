package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 28.01.2017.
 */
public class CollectCoins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[4][];

        for (int i = 0; i < 4; i++) {
            char[] input = scanner.nextLine().toCharArray();
            matrix[i] = new char[input.length];

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input[j];
            }
        }

        int rowPos = 0;
        int colPos = 0;
        int walls = 0;
        int coins = 0;

        if (matrix[rowPos][colPos] == '$') {
            coins++;
        }

        char[] commands = scanner.nextLine().toCharArray();

        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == 'V') {
                rowPos++;
            } else if (commands[i] == '>') {
                colPos++;
            } else if (commands[i] == '<') {
                colPos--;
            } else if (commands[i] == '^') {
                rowPos--;
            }

            try {
                if (matrix[rowPos][colPos] == '$') {
                    coins++;
                }
            } catch (IndexOutOfBoundsException e) {
                walls++;
                if (commands[i] == 'V') {
                    rowPos--;
                } else if (commands[i] == '>') {
                    colPos--;
                } else if (commands[i] == '<') {
                    colPos++;
                } else if (commands[i] == '^') {
                    rowPos++;
                }
            }
        }

        System.out.println("Coins = "+coins);
        System.out.println("Walls = "+walls);
    }
}
