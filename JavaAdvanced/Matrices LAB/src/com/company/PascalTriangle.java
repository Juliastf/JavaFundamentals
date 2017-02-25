package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 26.01.2017.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        long[][] pascal = new long[input][];
        int columns = 1;

        for (int i = 0; i < input; i++) {
            pascal[i]=new long[columns];
            for (int j = 0; j < columns; j++) {
                if (j == 0 || j == columns-1) {

                    pascal[i][j] =1 ;
                } else {

                    long number = pascal[i - 1][j - 1] + pascal[i - 1][j];
                    pascal[i][j]=number;

                }
            }
            columns++;
        }

        for (long[] longs : pascal) {
            for (long num : longs) {
                System.out.print(num+" ");
            }
            System.out.println();

        }
    }


}
