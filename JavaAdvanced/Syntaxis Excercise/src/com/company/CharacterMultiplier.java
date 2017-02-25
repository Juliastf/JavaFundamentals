package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 22.01.2017.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next("\\w+");
        String str2 = input.next("\\w+");
        int result = multiplyChars(str1, str2);

        System.out.println(result);
    }

    static int multiplyChars(String str1, String str2) {
        int length = Math.max(str1.length(), str2.length());
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int num1;
            int num2;

            if (i >= str1.length() || i >= str2.length()) {
                if (i >= str1.length()) {
                    sum += (str2.charAt(i));
                } else {
                    sum += (str1.charAt(i));
                }
            } else {
                sum += (str1.charAt(i)*str2.charAt(i));
            }
        }
        return sum;
    }
}
