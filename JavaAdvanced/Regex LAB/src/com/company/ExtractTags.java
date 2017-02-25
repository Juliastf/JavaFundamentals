package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class ExtractTags {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="<.+?>+";

        String input=scanner.nextLine();

        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        while   (!input.equals("END")){
            Matcher matcher=pattern.matcher(input);
            while (matcher.find()){
                System.out.println(matcher.group());
            }

            input=scanner.nextLine();
        }



    }
}
