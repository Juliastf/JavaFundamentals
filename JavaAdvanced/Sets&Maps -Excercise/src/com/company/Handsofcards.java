package com.company;

import java.util.*;

/**
 * Created by nikijul on 05.02.2017.
 */
public class Handsofcards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> colours = new HashMap<>();
        colours.put("C", 1);
        colours.put("D", 2);
        colours.put("H", 3);
        colours.put("S", 4);
        HashMap<String, Integer> cardNumber = new HashMap<>();
        cardNumber.put("J", 11);
        cardNumber.put("Q", 12);
        cardNumber.put("K", 13);
        cardNumber.put("A", 14);


        LinkedHashMap<String, HashSet<String>> players = new LinkedHashMap<>();

        while (true) {
            String command = scanner.nextLine();
            if ("JOKER".equals(command)) {
                break;
            } else {
                String[] input = command.trim().split(": ");
                String name = input[0];
                String[] cards = input[1].split("\\, ");

                if (!players.containsKey(name)) {
                    players.put(name, new HashSet<>());
                    for (int i = 0; i < cards.length; i++) {
                        players.get(name).add(cards[i]);
                    }
                } else {
                    for (int i = 0; i < cards.length; i++) {
                        players.get(name).add(cards[i]);
                    }
                }
            }
        }

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (String s : players.keySet()) {
            int sum = 0;
            for (String card : players.get(s)) {
                String number = card.substring(0, (card.length()) - 1);
                String colour = card.substring(card.length() - 1);
                int base = 0;
                int multiplier = colours.get(colour);
                if (cardNumber.containsKey(number)) {
                    base = cardNumber.get(number);
                } else {
                    base = Integer.parseInt(number);
                }
                sum += base * multiplier;
            }
            result.put(s,sum);
        }


        for (String s : result.keySet()) {
            System.out.println(s + ": " + result.get(s));

        }
    }
}
