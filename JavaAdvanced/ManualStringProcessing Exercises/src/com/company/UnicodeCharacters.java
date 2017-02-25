package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 09.02.2017.
 */
public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(scanner.nextLine());
        StringBuilder result=new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            int unicode=sb.codePointAt(i);
            result.append("\\u").append(String.format("%04X", unicode).toLowerCase());
        }

        System.out.println(result);


    }
}
