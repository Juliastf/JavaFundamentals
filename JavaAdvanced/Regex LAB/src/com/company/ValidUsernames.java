package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[\\w_\\d-]{3,16}$";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.println("valid");
            }else   {
                System.out.println("invalid");
            }
            input = scanner.nextLine();
        }

    }
}

