package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 27.01.2017.
 */
public class SquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input= scanner.nextLine().split(" ");
        int rows=Integer.parseInt(input[0]);
        int cols=Integer.parseInt(input[1]);

        char[][] matrix=new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] inputLine=scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=inputLine[j].charAt(0);
            }
        }

        int counter=0;

        for (int i = 0; i < rows-1 ; i++) {
            for (int j = 0; j < cols-1; j++) {
                if (matrix[i][j]==matrix[i][j+1]&&
                    matrix[i][j]==matrix[i+1][j]&&
                    matrix[i][j]==matrix[i+1][j+1]){
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
