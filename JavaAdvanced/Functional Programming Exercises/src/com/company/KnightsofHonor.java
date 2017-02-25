package com.company;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Created by nikijul on 13.02.2017.
 */
public class KnightsofHonor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");

        Consumer<String> printName= n-> System.out.println("Sir "+n);

        for (String s : input) {
            printName.accept(s);
        }
    }
}

