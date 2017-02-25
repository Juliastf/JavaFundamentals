package com.company;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by nikijul on 08.02.2017.
 */
public class ToBase10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger baseN =new BigInteger( scanner.next());
        String numberAsString=scanner.next();
        BigInteger number = new BigInteger(numberAsString);
        BigInteger result = new BigInteger("0");

        StringBuilder base10=new StringBuilder();

        for (int i =0; i <numberAsString.length() ; i++) {
            BigInteger remainder=number.divideAndRemainder(BigInteger.valueOf(10))[1];
            number=number.divideAndRemainder(BigInteger.valueOf(10))[0];
            result=result.add(baseN.pow(i).multiply(remainder));


        }

        System.out.println(result);
    }
}
