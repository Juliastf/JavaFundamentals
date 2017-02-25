package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 26.01.2017.
 */
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input= scanner.nextLine().split(" ");
        int rows=Integer.parseInt(input[0]);
        int cols=Integer.parseInt(input[1]);
        char[] alphabet=new char[26];
        int index=0;

        for (char i = 'a'; i <'a'+rows ; i++) {
            alphabet[index]=i;
            index++;
        }

        char start='a';
        char[][] matrixAB=new char[rows] [cols];
        for (int i = 0; i < cols ; i++) {
            for (int j = 0; j < rows; j++) {
                matrixAB[j][i]=start;
                start++;
            }
        }

        String[][] matrix=new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            char let2=alphabet[i];
            for (int j = 0; j < cols; j++) {
                char let1=alphabet[i];
                String palindrome=new StringBuilder().append(let1).append(let2).append(let1).toString();
                matrix[i][j]=palindrome;
                let2++;
            }
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();

        }



    }
}
