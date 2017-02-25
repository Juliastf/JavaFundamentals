package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 08.02.2017.
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] text=scanner.nextLine().toLowerCase().toCharArray();
        String word=scanner.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder();
        int count=0;

        for (int i = 0; i < text.length-word.length()+1 ; i++) {
            int n=i;
            while   (sb.length()<word.length()){
                sb.append(text[n]);
                n++;
            }
            if (sb.toString().equals(word)){
                count++;

            }
            sb=new StringBuilder();
        }

        System.out.println(count);
    }
}
