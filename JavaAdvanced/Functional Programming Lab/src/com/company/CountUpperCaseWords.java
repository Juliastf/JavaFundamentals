package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Created by nikijul on 12.02.2017.
 */
public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.asList(scanner.nextLine().split(" "));

        Predicate<String> checkUpperCase = word -> word.charAt(0) == word.toUpperCase().charAt(0);


        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (checkUpperCase.test(word)) {
                result.add(word);
            }
        }

        System.out.println(result.size());
        for (String word : result) {
            System.out.println(word);
        }
    }
}

