package com.company;

import com.sun.glass.ui.SystemClipboard;
import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;


public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input= scanner.nextLine().split(", ");

        int rows=Integer.parseInt(input[0]);
        int columns=Integer.parseInt(input[1]);


        int sum=0;
        int[][] matrix=new int[rows][columns];
        for (int i = 0; i <rows ; i++) {
            String[] temp=scanner.nextLine().split(", +");
            for (int j = 0; j < columns; j++) {
                matrix[i][j]=Integer.parseInt(temp[j]);
                sum+=matrix[i][j];

            }

        }
        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);
    }
}
