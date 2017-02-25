package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="(a|e|i|o|u|y)";

        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(scanner.nextLine());

        int count=0;
        while(matcher.find()){
            count++;
        }

        System.out.println("Vowels: "+count);

    }
}
