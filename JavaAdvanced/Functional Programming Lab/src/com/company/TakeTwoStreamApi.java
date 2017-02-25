package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Created by nikijul on 12.02.2017.
 */
public class TakeTwoStreamApi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> input= Arrays.asList(scanner.nextLine().split(" "));

        List<Integer> numbers=new ArrayList<>();

        Function<String, Integer> parser= n->Integer.parseInt(n);

        for (String number : input) {
            numbers.add(parser.apply(number));
        }

        numbers.stream()
                .filter(n->n>=10).filter(n->n<=20)
                .distinct()
                .limit(2)
                .forEach(n-> System.out.print(n+" "));

    }
}
