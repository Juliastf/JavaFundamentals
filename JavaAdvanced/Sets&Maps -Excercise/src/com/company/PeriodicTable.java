package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by nikijul on 04.02.2017.
 */
public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
           String[] input=scanner.nextLine().split(" ");
            for (String s : input) {
                elements.add(s);

            }
        }

        for (String element : elements) {
            System.out.print(element+" ");

        }
    }
}
