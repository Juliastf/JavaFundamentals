package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by nikijul on 04.02.2017.
 */
public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> player1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> player2 = new LinkedHashSet<>();

        for (int i = 0; i < 2; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (i == 0) {
                for (String s : input) {
                    player1.add(Integer.parseInt(s));
                }
            } else {
                for (String s : input) {
                    player2.add(Integer.parseInt(s));
                }
            }
        }

        for (int i = 0; i < 50; i++) {
            if (!player1.isEmpty() && !player2.isEmpty()) {
                int player1Card = player1.iterator().next();
                player1.remove(player1Card);
                int player2Card = player2.iterator().next();
                player2.remove(player2Card);
                if (player1Card > player2Card) {
                    player1.add(player1Card);
                    player1.add(player2Card);

                }
                else if (player2Card>player1Card){
                    player2.add(player1Card);
                    player2.add(player2Card);
                }
            }
            else    {
                break;
            }

        }

        if (player1.size()>player2.size()){
            System.out.println("First player win!");
        }
        else {
            System.out.println("Second player win!");

        }

    }

}

