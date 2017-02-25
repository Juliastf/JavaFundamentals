package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by nikijul on 07.02.2017.
 */
public class ParseTags {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();

        String word1="<upcase>";
        String word2="</upcase>";

        while   (input.contains(word2)){
            int index1=input.indexOf(word1);
            int index2=input.indexOf(word2);
            String toReplace=input.substring(index1,index2+word2.length());
            String replaced=toReplace.replace(word1,"");
            replaced=replaced.replace(word2,"").toUpperCase();
            input=input.replace(toReplace,replaced);
        }

        System.out.println(input);

    }
}
