package com.company;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by nikijul on 09.02.2017.
 */
public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[ ,.?!]");
        TreeSet result = new TreeSet();


        for (int i = 0; i < input.length; i++) {
            boolean isPalindrome = true;
            if (input[i].equals("")){
                continue;
            }
            if (input[i].length()==1){
                result.add(input[i]);
                        continue;
            }
            for (int j = 0; j < input[i].length() / 2; j++) {
                StringBuilder sbRev = new StringBuilder(input[i]).reverse();
                String reversed = sbRev.toString();
                if (input[i].charAt(j) != reversed.charAt(j)) {
                    isPalindrome = false;
                    break;

                }
            }
            if (isPalindrome) {
                result.add(input[i]);
            }

        }

        System.out.println(result);



    }
}
