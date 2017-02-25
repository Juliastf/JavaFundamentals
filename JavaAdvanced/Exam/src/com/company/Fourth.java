package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by nikijul on 19.02.2017.
 */
public class Fourth {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Long> totalScores = new LinkedHashMap<>();
        Map<String, List<String>> duels = new HashMap<>();

        String input = reader.readLine();

        while (!"osu!".equals(input)) {
            String[] players = input.split("<->");

            String[] player1 = players[0].split(" ");
            String nameP1 = player1[1];
            Long scoreP1 = Long.parseLong(player1[0]);

            String[] player2 = players[1].split(" ");
            String nameP2 = player2[0];
            Long scoreP2 = Long.parseLong(player2[1]);

            totalScores.putIfAbsent(nameP1, 0L);
            totalScores.putIfAbsent(nameP2, 0L);
            duels.putIfAbsent(nameP1, new ArrayList<>());
            duels.putIfAbsent(nameP2, new ArrayList<>());

            totalScores.put(nameP1, totalScores.get(nameP1) + (scoreP1 - scoreP2));
            String duel = nameP2 + " <-> " + (scoreP1 - scoreP2);
            duels.get(nameP1).add(duel);
            totalScores.put(nameP2, totalScores.get(nameP2) + (scoreP2 - scoreP1));
            String duel2 = nameP1 + " <-> " + (scoreP2 - scoreP1);
            duels.get(nameP2).add(duel2);


            input = reader.readLine();
        }


        totalScores.entrySet().stream()
                .sorted((r1, r2) ->
                        Long.compare(r2.getValue(), r1.getValue()))
                .forEach(x -> {
                    System.out.println(x.getKey() + " - (" + x.getValue() + ")");
                    String name = x.getKey();
                    for (String s : duels.get(name)) {
                        System.out.println("*   "+s);
                    }
                    ;


                });


    }
}
