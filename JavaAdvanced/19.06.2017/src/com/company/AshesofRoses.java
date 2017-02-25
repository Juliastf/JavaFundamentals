package com.company;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by nikijul on 18.02.2017.
 */
public class AshesofRoses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Map<String, Long>> roses = new TreeMap<>();
        String input = reader.readLine();
        Pattern pattern = Pattern.compile("^Grow <([A-Z][a-z]+)> <([a-zA-Z0-9]+)> ([0-9]+)$");

        while (!input.equals("Icarus, Ignite!")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String region = matcher.group(1);
                String color = matcher.group(2);
                long amount = Long.parseLong(matcher.group(3));

                roses.putIfAbsent(region, new TreeMap<>());
                roses.get(region).putIfAbsent(color, 0L);
                roses.get(region).put(color, roses.get(region).get(color) + amount);
            }
            input = reader.readLine();
        }


        roses.entrySet().stream()
                .sorted((r1, r2) ->{
                            Long sumR1 = r1.getValue().values().stream().mapToLong(e->e).sum();
                            Long sumR2 = r2.getValue().values().stream().mapToLong(e -> e).sum();
                            return (Long.compare(sumR2, sumR1));
                        })
                .forEach(x ->
                        { System.out.println(x.getKey());
                            x.getValue().entrySet().stream()
                                    .sorted((color1, color2) ->
                                         Long.compare(color1.getValue(), color2.getValue())
                                    )
                                    .forEach(color -> System.out.println("*--" + color.getKey() + " | " + color.getValue()));
                        });

    }
}


