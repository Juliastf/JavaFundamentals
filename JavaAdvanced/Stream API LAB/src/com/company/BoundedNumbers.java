package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by nikijul on 15.02.2017.
 */
public class BoundedNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> boundNumbers= Arrays.asList(scanner.nextLine().split(" ")).stream().map(n->Integer.parseInt(n))
                .sorted().collect(Collectors.toList());
        List<Integer> numbers=Arrays.asList(scanner.nextLine().split(" ")).stream().map(n->Integer.parseInt(n))
                .collect(Collectors.toList());

        numbers.stream()
                .filter(n->n>=boundNumbers.get(0)&&n<=boundNumbers.get(1))
                .forEach(n-> System.out.print(n+" "));
    }
}
