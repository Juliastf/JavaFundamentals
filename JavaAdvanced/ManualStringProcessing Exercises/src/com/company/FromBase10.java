package com.company;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by nikijul on 08.02.2017.
 */
public class FromBase10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseN = scanner.nextInt();
        BigInteger base10 = new BigInteger(scanner.next());


        StringBuilder sb = new StringBuilder();


        while (base10.compareTo(new BigInteger("0"))>0){
            BigInteger remainder = base10.divideAndRemainder(BigInteger.valueOf(baseN))[1];
            sb.append(remainder);
            base10 = base10.divide(BigInteger.valueOf(baseN));

        }

        sb.reverse();

        System.out.println(sb);


    }
}
