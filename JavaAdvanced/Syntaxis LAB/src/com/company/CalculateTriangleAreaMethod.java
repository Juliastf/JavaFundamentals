package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 21.01.2017.
 */
public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double base=input.nextDouble();
        double height=input.nextDouble();
        double area=calculateArea(base,height);
        System.out.printf("Area = %.2f", area);

    }

    static double calculateArea(double base, double height){
        return (base*height)/2;

    }
}
