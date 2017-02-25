package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class ExtractIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="(\\d+)";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(scanner.nextLine());


        while(matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
