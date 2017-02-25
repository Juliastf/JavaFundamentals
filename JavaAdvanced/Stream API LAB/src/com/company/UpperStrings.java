package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nikijul on 14.02.2017.
 */
public class UpperStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");

        Arrays.stream(input)
                .map(s->s.toUpperCase())
                .forEach(s-> System.out.print(s+" "));
    }
}
