package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyword=scanner.nextLine();
        String regex = "(^| )[^!.?]*\\b"+keyword+"\\b.*?[.!?]";

        Pattern pattern=Pattern.compile(regex);
        String input = scanner.nextLine();
        Matcher matcher=pattern.matcher(input);

        while   (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
