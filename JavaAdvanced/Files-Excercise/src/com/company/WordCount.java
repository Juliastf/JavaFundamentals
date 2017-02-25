package com.company;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by nikijul on 02.02.2017.
 */
public class WordCount {

    public static void main(String[] args) throws FileNotFoundException {
        String projectPath= System.getProperty("user.dir") + "/src/resources/";
       String wordsPath = projectPath + "words.txt";
        String text_Path = projectPath + "text.txt";
        String finalPath = projectPath + "results.txt";

        Map<String, Integer> wordsCount = new HashMap<>();
        Map<String, String> wordsOriginal = new HashMap<>();


        try (BufferedReader wordsReader = new BufferedReader(new FileReader(wordsPath));
             BufferedReader textReader = new BufferedReader(new FileReader(text_Path));
             BufferedWriter writer = new BufferedWriter(new FileWriter(finalPath))) {

            String line;
            while ((line = wordsReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String wordKey = word.toLowerCase();
                    if (!wordsCount.containsKey(wordKey)) {
                        wordsCount.put(wordKey, 0);
                        wordsOriginal.put(wordKey, word);
                    }
                }
            }

            while ((line = textReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String wordKey = word.toLowerCase();
                    if (wordsCount.containsKey(wordKey)) {
                        Integer count = wordsCount.get(wordKey) + 1;
                        wordsCount.put(wordKey, count);
                    }
                }
            }

            wordsCount.entrySet().stream().sorted((e1, e2) -> e2.getValue()
                    .compareTo(e1.getValue()))
                    .forEach(pair -> {
                        try {
                            writer.write(String.format("%s - %d", wordsOriginal.get(pair.getKey())
                                    , pair.getValue()) + System.lineSeparator());
                            //writer.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
}