package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nikijul on 10.02.2017.
 */
public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String word1 = input[0];
        String word2 = input[1];
        boolean isMagic = isMagic(word1, word2);

        System.out.println(isMagic);
    }

    private static boolean isMagic(String word1, String word2) {
        boolean isMagic = true;
        Map<Character, Character> chars = new HashMap<>();
        String longerWord = "";
        String shorterWord = "";


        if (word1.length() >= word2.length()) {
            longerWord = word1;
            shorterWord = word2;
        } else {
            longerWord = word2;
            shorterWord = word1;
        }

        for (int i = 0; i < shorterWord.length(); i++) {
            if (!chars.containsKey(longerWord.charAt(i)) && !chars.containsValue(shorterWord.charAt(i))) {
                chars.put(longerWord.charAt(i), shorterWord.charAt(i));
            } else if (chars.containsKey(longerWord.charAt(i)) && chars.get(longerWord.charAt(i)) == shorterWord.charAt(i)) {
                continue;
            } else {
                isMagic = false;
                break;
            }
        }
        if (word1.length() != word2.length()) {
            for (int i = shorterWord.length(); i < longerWord.length(); i++) {
                if (!chars.containsKey(longerWord.charAt(i))) {
                    isMagic = false;
                    break;

                }

            }
        }
        return isMagic;
    }
}