package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Created by nikijul on 13.02.2017.
 */
public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        List<Integer> numbers=new ArrayList<>();
        for (String number:input) {
            numbers.add(Integer.parseInt(number));

        }

        Function<List<Integer>,Integer> findMin=n->{
            int min=Integer.MAX_VALUE;

            for (int i = 0; i <numbers.size() ; i++) {
                if (numbers.get(i)<min) {
                    min=numbers.get(i);
                }

            }
            return min;
        };

        System.out.println(findMin.apply(numbers));

    }
}
