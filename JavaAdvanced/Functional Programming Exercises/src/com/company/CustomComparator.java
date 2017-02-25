package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by nikijul on 13.02.2017.
 */
public class CustomComparator {
    public static void main(String[] args)       throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer[] numbers = Arrays.stream(reader.readLine().split(" "))
                    .map(Integer::parseInt).toArray(Integer[]::new);

            Comparator<Integer> integerComparator = (n1, n2) -> {
                int n1A = Math.abs(n1);
                int n2A = Math.abs(n2);

                if (n1A % 2 == 0 && n2A % 2 == 1) {
                    return -1;
                } else if (n1A % 2 == 1 && n2A % 2 == 0) {
                    return 1;
                } else if (n1 < n2) {
                    return -1;
                } else if (n2 < n1) {
                    return 1;
                }
                return 0;
            };

            Arrays.sort(numbers, integerComparator);

            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
    }
}
