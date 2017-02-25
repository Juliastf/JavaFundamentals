package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by nikijul on 28.01.2017.
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
        }

        boolean isPalindrome=true;
        for (int i = 0; i < queue.size()/2; i++) {
            if (queue.pollFirst()!=queue.pollLast()) {
                isPalindrome=false;
                break;
            }
        }

        System.out.println(isPalindrome);


    }
}