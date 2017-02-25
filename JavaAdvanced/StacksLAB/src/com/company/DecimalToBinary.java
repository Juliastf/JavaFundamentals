package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by nikijul on 28.01.2017.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        do {
            stack.push(n%2);
            n=n/2;
        }while (n>0);

        for (Integer integer : stack) {
            System.out.print(integer);

        }
    }
}
