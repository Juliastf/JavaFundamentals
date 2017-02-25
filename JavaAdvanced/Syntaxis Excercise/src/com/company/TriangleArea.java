package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 21.01.2017.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aX=input.nextInt();
        int aY=input.nextInt();
        input.nextLine();
        int bX=input.nextInt();
        int bY=input.nextInt();
        input.nextLine();
        int cX=input.nextInt();
        int cY=input.nextInt();
        double area=(aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY))/2;

       System.out.printf("%.0f", Math.abs(area));

    }
}
