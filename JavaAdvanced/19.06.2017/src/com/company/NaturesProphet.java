package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nikijul on 18.02.2017.
 */
public class NaturesProphet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tokens=scanner.nextLine().split(" ");
        int rows=Integer.parseInt(tokens[0]);
        int cols=Integer.parseInt(tokens[1]);

        Integer [][] garden=new Integer[rows][cols];
        Integer [][] flowersPosition=new Integer[rows][cols];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                garden[i][j]=0;
                flowersPosition[i][j]=0;
            }

        }


        String input=scanner.nextLine();

        while (!input.equals("Bloom Bloom Plow")){
            String[] currentPosition=input.split(" ");
            int row=Integer.parseInt(currentPosition[0]);
            int col=Integer.parseInt(currentPosition[1]);
            flowersPosition[row][col]=1;
            input=scanner.nextLine();
        }

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols; j++) {
                if (flowersPosition[i][j]==1){
                    garden[i][j]+=1;
                    int row=i;
                    int col=j;
                    garden=bloomGarden(row, col, garden);
                }
                else {
                    continue;
                }
            }

        }

        for (Integer[] integers : garden) {
            for (Integer integer : integers) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }

    private static Integer[][] bloomGarden(int row, int col, Integer[][] garden) {
        for (int i = 0; i <garden[0].length ; i++) {
            if (i==col){
                continue;
            }
            garden[row][i]+=1;
        }

        for (int i = 0; i <garden.length ; i++) {
            if (i==row){
                continue;
            }
            garden[i][col]+=1;

        }
        return garden;
    }
}
