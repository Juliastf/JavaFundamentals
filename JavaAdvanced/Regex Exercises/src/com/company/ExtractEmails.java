package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(^| )([a-zA-Z0-9][A-z-\\d\\.]+[A-z\\d]@[A-z-]+(\\.[A-z]+)+)(?:\\.|,|$| )";
        Pattern pattern=Pattern.compile(regex);
        String input = scanner.nextLine();

        while   (!input.equals("end")){
            Matcher matcher=pattern.matcher(input);
            while (matcher.find()){
                System.out.println(matcher.group(2));

            }
            input=scanner.nextLine();
        }
    }
}
