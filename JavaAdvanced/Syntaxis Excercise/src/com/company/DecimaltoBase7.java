package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 21.01.2017.
 */
public class DecimaltoBase7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String base7=Integer.toString(num, 7);

        System.out.println(base7);
    }
}
