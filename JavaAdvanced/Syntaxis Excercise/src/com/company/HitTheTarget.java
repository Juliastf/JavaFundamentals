package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 22.01.2017.
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int target=input.nextInt();
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j <21 ; j++) {
                if (i+j==target){
                    System.out.printf("%d + %d = %d\n", i,j,target);
                }
            }

        }

        for (int i = 1; i <21; i++) {
            for (int j = 1; j <21 ; j++) {
                if (i-j==target){
                    System.out.printf("%d - %d = %d\n", i,j,target);
                }
            }

        }
    }
}
