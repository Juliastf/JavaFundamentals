package com.company;

import org.omg.CORBA.MARSHAL;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by nikijul on 11.02.2017.
 */
public class MatchPhoneNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String regex = "^\\+359( |-)2\\1\\d{3}\\1\\d{4}$";
        Pattern pattern=Pattern.compile(regex);
        String input = scanner.nextLine();

        while   (!input.equals("end")){
            Matcher matcher=pattern.matcher(input);
            if (matcher.find()){
                System.out.println(matcher.group());

            }
            input=scanner.nextLine();
        }
    }
}
