package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 21.01.2017.
 */
public class Base7ToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String base7 = input.nextLine();
        int result=Integer.valueOf(base7, 7);


        System.out.println(result);
    }
}
