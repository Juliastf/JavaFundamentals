package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by nikijul on 04.02.2017.
 */
public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            usernames.add(scanner.nextLine());

        }

        for (String username : usernames) {
            System.out.println(username);

        }
    }
}
