package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nikijul on 18.02.2017.
 */
public class CubicAssault {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Map<String, Long>> cubic = new TreeMap<>();
        String input = reader.readLine();

        while (!input.equals("Count em all")) {
            String[] tokens = input.split(" -> ");
            String region = tokens[0];
            String weapon = tokens[1];
            Long amount = Long.parseLong(tokens[2]);

            cubic.putIfAbsent(region, new TreeMap<>());
            cubic.get(region).putIfAbsent(weapon, 0L);
            cubic.get(region).put(weapon, cubic.get(region).get(weapon) + amount);

            input = reader.readLine();
        }

        for (String region : cubic.keySet()) {
            if (!cubic.get(region).containsKey("Black")) {
                cubic.get(region).put("Black", 0L);
            }
            if (!cubic.get(region).containsKey("Red")) {
                cubic.get(region).put("Red", 0L);
            }
            if (!cubic.get(region).containsKey("Green")) {
                cubic.get(region).put("Green", 0L);
            }
            while (cubic.get(region).get("Red") >= 1000000 || cubic.get(region).get("Green") >= 1000000) {
                for (String weapon : cubic.get(region).keySet()) {
                    long amount = cubic.get(region).get(weapon);
                    if (amount >= 1000000) {
                        long newType = amount / 1000000;
                        long difference = amount % 1000000;
                        if (weapon.equals("Green")) {
                            cubic.get(region).put(weapon, difference);
                            cubic.get(region).put("Red", cubic.get(region).get("Red") + newType);
                        } else if (weapon.equals("Red")) {
                            cubic.get(region).put(weapon, difference);
                            cubic.get(region).put("Black", cubic.get(region).get("Black") + newType);
                        }
                    }
                }
            }
        }

        cubic.entrySet().stream()
                .sorted((region1, region2) -> {
                    long blackRegion1 = region1.getValue().get("Black");
                    long blackRegion2 = region2.getValue().get("Black");
                    if (blackRegion1 == blackRegion2) {
                        return Integer.compare(region1.getKey().length(), region2.getKey().length());
                    }
                    return Long.compare(blackRegion2, blackRegion1);
                })
                .forEach(region -> {
                    System.out.println(region.getKey());

                    region.getValue().entrySet().stream()
                            .sorted((weapon1, weapon2) -> Long.compare(weapon2.getValue(), weapon1.getValue()))
                            .forEach(weapon -> System.out.println("-> " + weapon.getKey() + " : " + weapon.getValue()));

                });
    }
}
