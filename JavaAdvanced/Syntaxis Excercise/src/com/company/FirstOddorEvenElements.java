package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nikijul on 22.01.2017.
 */
public class FirstOddorEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().trim().split("\\s");
        String[] condition = input.nextLine().trim().split("\\s");
        ArrayList<Integer> result = calculateResult(numbers, condition);
        for (int number : result) {
            System.out.print(number + " ");
        }

    }

    private static ArrayList<Integer> calculateResult(String[] numbers, String[] condition) {
        int length = numbers.length;
        int n = Integer.parseInt(condition[1]);
        String oddOrEven = condition[2];
        ArrayList<Integer> result = new ArrayList<Integer>();
        int counter = 0;


        if (oddOrEven.equals("odd")) {
            for (int i = 0; i < length; i++) {
                int number = Integer.parseInt(numbers[i]);
                if (number % 2 != 0&&counter<n) {
                   result.add(number);
                    counter++;

                }

            }
        } else if (oddOrEven.equals("even")) {
            for (int i = 0; i < length; i++) {
                int number = Integer.parseInt(numbers[i]);
                if (number % 2 == 0&&counter<n) {
                    result.add(number);
                    counter++;

                }

            }
        }


        return result;

}
}
