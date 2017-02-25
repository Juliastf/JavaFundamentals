package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 12.02.2017.
 */
public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        String regex = "([A-Z][A-Za-z]*)[^A-Za-z\\+]*?(\\+?[\\d]+?[\\d\\(\\)\\/\\.\\-\\s]*\\d)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group(1);
                String[] phoneNumber = matcher.group(2).split("[()\\/.\\- ]");

                phoneBook.put(name, String.join("",phoneNumber));
            }
            input = scanner.nextLine();
        }

        if (!phoneBook.isEmpty()) {
            System.out.print("<ol>");
            for (String s : phoneBook.keySet()) {
                System.out.print("<li><b>"+s + ":</b> " + phoneBook.get(s) + "</li>");

            }
            System.out.print("</ol>");
        } else {
            System.out.println("<p>No matches!</p>");
        }
    }
}
