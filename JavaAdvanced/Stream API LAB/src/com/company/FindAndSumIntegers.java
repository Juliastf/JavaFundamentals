package com.company;

import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Created by nikijul on 14.02.2017.
 */
public class FindAndSumIntegers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.asList(scanner.nextLine().split(" "));

        OptionalInt result = numbers.stream()
                .filter(n -> !n.isEmpty())
                .filter(n -> isItNumber(n))
                .mapToInt(n->Integer.parseInt(n))
                .reduce((x,y)->x+y);

        if (result.isPresent()){
            System.out.println(result.getAsInt());
        }
        else {
            System.out.println("No match");
        }
    }

    private static boolean isItNumber(String n) {
        try {
            Integer.parseInt(n);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}





