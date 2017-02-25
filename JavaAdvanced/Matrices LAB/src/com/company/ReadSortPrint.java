package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nikijul on 25.01.2017.
 */
public class ReadSortPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberRows=Integer.parseInt(scanner.nextLine());
        String[] names=new String[numberRows];

        for (int i = 0; i < numberRows; i++) {
            names[i]=scanner.nextLine();
        }

        Arrays.sort(names);

        for (int i = 0; i < numberRows; i++) {
            System.out.println(names[i]);
        }
    }
    }

