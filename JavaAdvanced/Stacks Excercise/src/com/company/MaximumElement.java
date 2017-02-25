package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by nikijul on 30.01.2017.
 */
public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> maxNumbers = new ArrayDeque<>();

        int max = Integer.MIN_VALUE;


        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("1")) {
                int number = Integer.parseInt(input[1]);
                stack.push(number);
                if (number > max) {
                    max = number;
                    maxNumbers.push(number);

                }
            } else if (input[0].equals("2")) {
                int removed = stack.pop();
                if (removed == max) {
                    maxNumbers.pop();
                    if (maxNumbers.isEmpty()) {
                        max = Integer.MIN_VALUE;
                    } else {
                        max = maxNumbers.peek();
                    }
                }

            } else {
                if (!maxNumbers.isEmpty()) {
                    System.out.println(maxNumbers.peek());
                }
            }

        }
    }
}
