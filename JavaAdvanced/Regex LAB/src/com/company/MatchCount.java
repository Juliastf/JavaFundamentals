package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class MatchCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile(scanner.nextLine());
        Matcher matcher=pattern.matcher(scanner.nextLine());

        int count=0;

        while(matcher.find()){
            count++;
        }

        System.out.println(count);
    }
}
