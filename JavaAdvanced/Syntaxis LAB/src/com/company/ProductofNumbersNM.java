package com.company;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by nikijul on 21.01.2017.
 */
public class ProductofNumbersNM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int counter=n;

        BigInteger product=new BigInteger("1");

        do {
            BigInteger n1=new BigInteger(""+counter);
            product=product.multiply(n1);
            counter++;
        }while (counter<=m);

        System.out.printf("product[%d..%d] = %d", n, m, product);

    }
}
