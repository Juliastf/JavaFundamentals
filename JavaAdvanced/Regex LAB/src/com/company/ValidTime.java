package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class ValidTime {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String regex = "(\\d{2}):(\\d{2}):(\\d{2}) (AM|PM)";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();


        while (!input.equals("END")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String hours = matcher.group(1);
                String mins = matcher.group(2);
                String secs = matcher.group(3);
                if (timeIsValid(hours, mins, secs))
                    System.out.println("valid");
                else    {
                    System.out.println("invalid");
                }
            } else {
                System.out.println("invalid");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean timeIsValid(String hours, String mins, String secs) {
        if (Integer.parseInt(hours) <= 0 | Integer.parseInt(hours) > 13) {
            return false;
        } else if (Integer.parseInt(mins) <= 0 | Integer.parseInt(mins) > 59) {
            return false;
        } else if (Integer.parseInt(secs) <= 0 | Integer.parseInt(secs) > 59) {
            return false;
        }
        return true;
    }
}
