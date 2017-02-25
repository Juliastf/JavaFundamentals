package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nikijul on 11.02.2017.
 */
public class ReplaceaTag {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String input=scanner.nextLine();

        while(!input.equals("END")){
            sb.append(input).append("\r\n");
            input=scanner.nextLine();
        }

        String regex= "<a\\s+(href=[^>]+)>([^<]+)<\\/a>";
        Pattern pattern=Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher=pattern.matcher(sb);
        int index=0;
        while  (matcher.find(0)){
            int start=matcher.start();
            int end=matcher.end();
            String replace="[URL "+matcher.group(1)+"]"+matcher.group(2)+"[/URL]";
            sb=sb.replace(start,end,replace);
            matcher=pattern.matcher(sb);
        }

        System.out.println(sb);

    }
}
