package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nikijul on 07.02.2017.
 */
public class SpecialWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] specialWords = reader.readLine().split(" ");
        String[] text = reader.readLine().split(" ");

        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < specialWords.length; i++) {
            result.put(specialWords[i], 0);
            for (int j = 0; j < text.length; j++) {

                if (specialWords[i].equals(text[j])) {
                    result.put(specialWords[i], result.get(specialWords[i]) + 1);
                }
            }
        }

        for (String s : result.keySet()) {
            System.out.println(s+" - "+result.get(s));

        }

    }
}
