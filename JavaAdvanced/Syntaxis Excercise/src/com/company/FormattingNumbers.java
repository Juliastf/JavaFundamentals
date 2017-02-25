package com.company;

import java.text.Format;
import java.util.Scanner;

/**
 * Created by nikijul on 21.01.2017.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        double b=input.nextDouble();
        double c=input.nextDouble();
        String binary=Integer.toBinaryString(a);
        binary= String.format("%10s", binary).replace(' ', '0');


        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a, binary, b, c);
    }
}
