package com.company;

import java.util.*;

/**
 * Created by nikijul on 29.01.2017.
 */
public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scannere = new Scanner(System.in);
        String[] commands = scannere.nextLine().split(" ");
        int numberToPush = Integer.parseInt(commands[0]);
        int numberToPop = Integer.parseInt(commands[1]);
        int numberToCheck = Integer.parseInt(commands[2]);

        String[] numbers = scannere.nextLine().split(" ");
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberToPush; i++) {
            stack.push(Integer.parseInt(numbers[i]));

        }

        for (int i = 0; i < numberToPop; i++) {
            stack.pop();
        }

        int min = Integer.MAX_VALUE;

        boolean isPresent=false;

        if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            while (!stack.isEmpty()){
                int number = stack.pop();
                if (number == numberToCheck) {
                   isPresent=true;
                    break;
                } else {
                    if (number < min) {
                        min = number;
                    }
                }
            }

            if (isPresent){
                System.out.println("true");
            } else {
                System.out.println(min);
            }

        }



    }
}
