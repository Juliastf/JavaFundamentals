package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+$";

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (Pattern.matches(regex, input)) {
                System.out.println(input);
            }
            input = scanner.nextLine();
        }

    }
}
