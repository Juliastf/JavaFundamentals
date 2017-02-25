package com.company;


import java.math.BigDecimal;
import java.util.Formatter;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Double quantity=input.nextDouble();
        double price=1.20;
        BigDecimal rate=new BigDecimal("4210500000000");
        BigDecimal priceInMarks=new BigDecimal(quantity*price);
        BigDecimal finalPrice=rate.multiply(priceInMarks);

        System.out.printf("%.2f marks", finalPrice);
    }
}
