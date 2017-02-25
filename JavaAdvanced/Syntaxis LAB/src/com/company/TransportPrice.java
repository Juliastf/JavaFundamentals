package com.company;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double distance = Double.valueOf(input.nextLine());
        String time = input.nextLine();
        double taxiPrice = 0.79;

        if (time.equals("night")) {
            taxiPrice = 0.90;
        }

        if (distance < 20) {
            System.out.printf("%.2f", taxiPrice * distance + 0.7);
        } else if (distance < 100) {
            System.out.printf("%.2f", distance * 0.09);
        } else  {
            System.out.printf("%.2f", distance*0.06);
        }
    }
}
