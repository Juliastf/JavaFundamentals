package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by nikijul on 04.02.2017.
 */
public class CountSameValuesinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        HashMap<String, Integer> result=new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            String number=input[i];
            if (result.containsKey(number)){
                result.put(number,result.get(number)+1);
            }
            else {
                result.put(number, 1);
            }
        }

        for (String key : result.keySet()) {
            System.out.println(key+" - "+result.get(key)+" times");
            
        }
    }
}
