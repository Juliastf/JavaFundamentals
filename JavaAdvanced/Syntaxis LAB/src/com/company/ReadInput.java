package com.company;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by nikijul on 21.01.2017.
 */
public class ReadInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next("\\w+");
        String string2 = scanner.next("\\w+");
        Integer int1 = scanner.nextInt();
        Integer int2 = scanner.nextInt();
        Integer int3 = scanner.nextInt();
        scanner.nextLine();
        String string3 = scanner.nextLine();
        Integer sum=(int1+int2+int3);

        System.out.println(string1+ " "+ string2+" "+string3+" "+sum );
    }
}
