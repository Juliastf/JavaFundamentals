package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by nikijul on 14.02.2017.
 */
public class TakeTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> input= Arrays.asList(scanner.nextLine().split("\\s+")).stream()
                .map(n->Integer.parseInt(n)).collect(Collectors.toList());

        input.stream()
                .distinct()
                .filter(n->n>=10&&n<=20)
                .limit(2)
                .forEach(n-> System.out.print(n+" "));
    }
}
