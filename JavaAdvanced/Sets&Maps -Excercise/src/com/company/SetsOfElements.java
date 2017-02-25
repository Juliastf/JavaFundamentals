package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by nikijul on 04.02.2017.
 */
public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        LinkedHashSet<Integer> result = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set1.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < m; i++) {
            set2.add(Integer.parseInt(scanner.nextLine()));
        }

        if (n>=m){
            for (Integer number : set1) {
                if (set2.contains(number)){
                    result.add(number);
                }
            }
        }
        else    {
            for (Integer number : set2) {
                if (set1.contains(number)){
                    result.add(number);
                }
            }
        }

        for (Integer integer : result) {
            System.out.print(integer+" ");

        }

    }
}
