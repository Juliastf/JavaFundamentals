package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 21.01.2017.
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String secondName = input.nextLine();

        if (firstName.isEmpty()) {
            firstName = "*****";
        }

        if (secondName.isEmpty()) {
            firstName = "*****";
        }

        System.out.println("Hello, "+firstName+" "+secondName+"!");
    }
}
