package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Created by nikijul on 12.02.2017.
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> input= Arrays.asList(scanner.nextLine().split(", "));

        Function<String, Integer> parser=n->Integer.parseInt(n);
        int sum=0;

        for (String s : input) {
            sum+=parser.apply(s);
        }

        System.out.println("Count = "+input.size());
        System.out.println("Sum = "+sum);



    }
}
