package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 22.01.2017.
 */
public class OddandEvenPairs {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] array = input.nextLine().trim().split("\\s");
        int numberOfElements = array.length;
        int[] arrayToCheck = new int[numberOfElements];
        int count = 0;
        if (numberOfElements % 2 != 0)
            System.out.println("invalid length");
        else {

            for (int i = 0; i < numberOfElements; i++) {
                arrayToCheck[i] = Integer.parseInt(array[i]);

            }

            for (int i = 0; i < numberOfElements-1; i++) {
                if ((arrayToCheck[i] % 2 == 0) && (arrayToCheck[i + 1] % 2 == 0)) {
                    System.out.printf("%d, %d -> both are even\n", arrayToCheck[i], arrayToCheck[i + 1] );
                } else if ((arrayToCheck[i] % 2 != 0) && (arrayToCheck[i + 1] % 2 != 0)) {
                    System.out.printf("%d, %d -> both are odd\n", arrayToCheck[i], arrayToCheck[i + 1] );
                } else {
                    System.out.printf("%d, %d -> different\n", arrayToCheck[i], arrayToCheck[i + 1] );
                }
                i++;

            }
        }
    }
}