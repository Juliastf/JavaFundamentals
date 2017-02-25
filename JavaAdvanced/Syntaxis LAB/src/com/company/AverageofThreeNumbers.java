package com.company;

import java.util.Scanner;

public class AverageofThreeNumbers {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Double num1 = input.nextDouble();
        Double num2 = input.nextDouble();
        Double num3 = input.nextDouble();
        double result = (num1 + num2 + num3) / 3;

        System.out.printf("%.2f", result);

    }
}
