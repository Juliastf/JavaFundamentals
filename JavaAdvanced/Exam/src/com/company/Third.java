package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 19.02.2017.
 */
public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex = "([,|_])([a-zA-Z]+)([\\d]{1})";
        Pattern pattern = Pattern.compile(regex);
        String input = reader.readLine();


        while (!"Ascend".equals(input)) {

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String message = matcher.group(0);
                String action = matcher.group(1);
                String letters = matcher.group(2);
                int digit = Integer.parseInt(matcher.group(3));
                StringBuilder code = new StringBuilder();

                if (action.equals(",")) {
                    for (int i = 0; i < letters.length(); i++) {
                        char decoded = (char) (letters.charAt(i) + digit);
                        code.append(decoded);
                    }
                } else if (action.equals("_")) {
                    for (int i = 0; i < letters.length(); i++) {
                        char decoded = (char) (letters.charAt(i) - digit);
                        code.append(decoded);
                    }
                }

                input=input.replace(message,code.toString());
                matcher=pattern.matcher(input);


            }

            System.out.println(input);
            input = reader.readLine();


        }
    }
}
