package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by nikijul on 05.02.2017.
 */
public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();
            String[] end = email.split("\\.");
            if (!end[end.length-1].equals("us") && !end[end.length-1].equals("uk") && !end[end.length-1].equals("com")) {
                emails.put(name, email);

            }
            input = scanner.nextLine();

        }

        for (String s : emails.keySet()) {
            System.out.println(s+" -> "+emails.get(s));

        }
    }
}
