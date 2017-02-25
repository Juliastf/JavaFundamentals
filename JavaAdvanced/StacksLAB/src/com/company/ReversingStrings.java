package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReversingStrings {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        ArrayDeque<Character> reversed=new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            reversed.push(c);
        }

        while   (!reversed.isEmpty()){
            char c=reversed.poll();
            System.out.print(c);
        }
    }
}
