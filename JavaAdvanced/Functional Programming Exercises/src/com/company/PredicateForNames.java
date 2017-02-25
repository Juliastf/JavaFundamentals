package com.company;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by nikijul on 13.02.2017.
 */
public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        String[] input=scanner.nextLine().split(" ");

        BiPredicate<String, Integer> isCorrectLength= (name,num)->name.length()<=num;

        for (String s : input) {
            if(isCorrectLength.test(s, number)){
                System.out.println(s);
            }
        }
    }
}
