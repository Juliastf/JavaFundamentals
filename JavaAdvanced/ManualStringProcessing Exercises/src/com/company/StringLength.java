package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 07.02.2017.
 */
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 20; i++) {
            if (i > input.length() - 1) {
                sb.append("*");
            } else {
                sb.append(input.charAt(i));

            }
        }

        System.out.println(sb);
    }
}
