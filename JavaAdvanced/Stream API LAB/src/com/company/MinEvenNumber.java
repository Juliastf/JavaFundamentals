package com.company;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by nikijul on 14.02.2017.
 */
public class MinEvenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> numbers= Arrays.asList(scanner.nextLine().split(" "));

        DoubleStream filter=numbers.stream()
                .filter(n->!n.isEmpty())
                .mapToDouble(n->Double.parseDouble(n))
                .filter(n->n%2==0)
                .sorted();
        OptionalDouble minEven=filter.findFirst();

        if (minEven.isPresent()){
            System.out.println(String.format("%.2f",minEven.getAsDouble()));
        } else {
            System.out.println("No match");
        }

    }
}
