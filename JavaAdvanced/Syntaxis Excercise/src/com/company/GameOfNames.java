package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 22.01.2017.
 */
public class GameOfNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPlayers = Integer.parseInt(input.nextLine());

        String[] names = new String[numberOfPlayers];
        Integer[] initialScore = new Integer[numberOfPlayers];
        long counter = 0;
        long highestResult = 0;
        String winner = "";

        for (int i = 0; i < numberOfPlayers; i++) {
            names[i] = input.nextLine();
            initialScore[i] = Integer.parseInt(input.nextLine());

        }

        for (int i = 0; i < numberOfPlayers; i++) {
            counter = initialScore[i];
            for (int j = 0; j < names[i].length(); j++) {
                int code = names[i].charAt(j);
                if (code % 2 == 0) {
                    counter += code;
                } else {
                    counter -= code;
                }
            }

            if (counter > highestResult) {
                highestResult = counter;
                winner = names[i];
            }
            counter = 0;
        }


        System.out.printf("The winner is %s - %d points", winner, highestResult);
    }

}

