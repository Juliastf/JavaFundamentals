package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Created by nikijul on 12.02.2017.
 */
public class SortOddNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> input= Arrays.asList(scanner.nextLine().split(", "));

        List<Integer> numbers = new ArrayList<>();

        for (String number : input) {
            numbers.add(Integer.parseInt(number));
        }

        StringBuilder sb = new StringBuilder();

        numbers.removeIf(number -> number % 2 != 0);
        for (Integer number : numbers) {
            sb.append(number);
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);

        numbers.sort((a, b) -> a.compareTo(b));
        List<String> sorted = new ArrayList<>();

        for (Integer number : numbers) {
            sorted.add(String.valueOf(number));
        }

        System.out.println(String.join(", ", sorted));
    }
}
