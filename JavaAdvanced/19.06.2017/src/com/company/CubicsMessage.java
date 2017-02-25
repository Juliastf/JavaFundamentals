package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 18.02.2017.
 */
public class CubicsMessage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int length = 0;



        while (!("Over!").equals(input)) {
            length = Integer.parseInt(reader.readLine());
            String regex = "^([\\d]+)([A-Za-z]{" + length + "})([^a-zA-Z]*)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            StringBuilder coding = new StringBuilder();

            while (matcher.find()) {
                String message = matcher.group(2);
                String digitsBefore = matcher.group(1);
                String charsAfter = matcher.group(3);
                StringBuilder digits = new StringBuilder();
                digits.append(digitsBefore);

                for (int i = 0; i < charsAfter.length(); i++) {
                    if (Character.isDigit(charsAfter.charAt(i))) {
                        digits.append(charsAfter.charAt(i));
                    }
                }
                for (int i = 0; i < digits.length(); i++) {


                    try {
                        int index =Character.getNumericValue(digits.charAt(i));
                        coding.append(message.charAt(index));
                    } catch (IndexOutOfBoundsException e) {
                        coding.append(" ");

                    }
                }

                System.out.println(message+" == "+coding.toString());

            }
            input = reader.readLine();


        }
    }
}
