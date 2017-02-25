package com.company;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by nikijul on 02.02.2017.
 */
public class CountCharacterTypes {
    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "/src/Input.txt";
        String outputPath = "/src/Output.txt";

        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + inputPath;
        String outputFilePath = projectPath + outputPath;

        File taskFile = new File(filePath);
        FileReader fileReader = new FileReader(taskFile);

        try (BufferedReader reader = new BufferedReader(fileReader);
             PrintWriter writer = new PrintWriter(outputFilePath)) {
            String line;
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;

            HashSet<Character> vowelsList = new HashSet<>();
            Collections.addAll(vowelsList, 'a', 'e', 'i', 'o', 'u');

            HashSet<Character> punctuationList = new HashSet<>();
            Collections.addAll(punctuationList, '!', ',', '.', '?');

            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c != ' ') {
                        if (vowelsList.contains(c)) {
                            vowels++;
                        } else if (punctuationList.contains(c)) {
                            punctuation++;
                        } else {
                            consonants++;
                        }
                    }
                }
            }

            writer.println("Vowels: " + vowels);
            writer.println("Consonants: " + consonants);
            writer.println("Punctuation: " + punctuation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
