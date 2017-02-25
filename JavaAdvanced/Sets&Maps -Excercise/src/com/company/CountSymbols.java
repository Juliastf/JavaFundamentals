package com.company;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by nikijul on 04.02.2017.
 */
public class CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();

        TreeMap<Character, Integer> result = new TreeMap<Character, Integer>();
        for (int i = 0; i <input.length ; i++) {
            if (!result.containsKey(input[i])){
                result.put(input[i],1);

            }
            else    {
                result.put(input[i],result.get(input[i])+1);
            }
        }

        for (Character character : result.keySet()) {
            System.out.println(character+": "+result.get(character)+" time/s");

        }
    }
}
