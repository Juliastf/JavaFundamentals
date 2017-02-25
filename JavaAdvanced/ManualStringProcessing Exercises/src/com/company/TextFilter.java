package com.company;


import java.util.Scanner;

/**
 * Created by nikijul on 09.02.2017.
 */
public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] bannedWords=scanner.nextLine().split(", ");
        String input=scanner.nextLine();
        StringBuilder text=new StringBuilder(input);
        int index=0;

        for (int i = 0; i < bannedWords.length; i++) {
            StringBuilder asterix=new StringBuilder();
            for (int j = 0; j <bannedWords[i].length() ; j++) {
                asterix.append("*");
            }
            String asterixToReplace=asterix.toString();
            while (text.indexOf(bannedWords[i],index)>-1) {
                int startIndex=text.indexOf(bannedWords[i]);
                text=text.replace(startIndex, startIndex+bannedWords[i].length(),asterixToReplace);
                index=index+bannedWords.length;
            }
        }

        System.out.println(text);
    }
}
