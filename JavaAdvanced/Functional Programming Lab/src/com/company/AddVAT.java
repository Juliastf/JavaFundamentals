package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

/**
 * Created by nikijul on 12.02.2017.
 */
public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String > input= Arrays.asList(scanner.nextLine().split(", "));

        List <Double> prices=new ArrayList<>();
        for (String number : input) {
            prices.add(Double.parseDouble(number));
        }

        UnaryOperator<Double> addVat= n->n*1.20;
        System.out.println("Prices with VAT:");

        for (Double price : prices) {
            System.out.println(String.format("%.2f",addVat.apply(price)).replace('.',','));

        }
    }
}
