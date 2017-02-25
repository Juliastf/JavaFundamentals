package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by nikijul on 04.02.2017.
 */
public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("search")) {
                break;
            } else {
                String[] contact = input.split("-");
                phonebook.put(contact[0], contact[1]);
            }
        }
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                if (phonebook.containsKey(input)) {
                    System.out.println(input + " -> " + phonebook.get(input));
                } else {
                    System.out.println("Contact " + input + " does not exist.");
                }
            }


        }
    }
}
