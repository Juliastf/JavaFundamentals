package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 07.02.2017.
 */
public class ConcatenatingStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(scanner.nextLine()+" ");

        }
        System.out.println(sb);
    }
}
