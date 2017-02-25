package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nikijul on 25.01.2017.
 */
public class GroupNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(", ");
        ArrayList <ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList <Integer> result0=new ArrayList<Integer>();
        result.add(result0);
        ArrayList <Integer> result1=new ArrayList<Integer>();
        result.add(result1);
        ArrayList <Integer> result2=new ArrayList<Integer>();
        result.add(result2);


        for (int i = 0; i < input.length ; i++) {
            int number = Math.abs(Integer.parseInt(input[i]));
            if (number % 3 == 0) {
                result0.add(Integer.parseInt(input[i]));
            } else if (number % 3 == 1) {
                result1.add(Integer.parseInt(input[i]));
            } else if (number % 3 == 2) {
                result2.add(Integer.parseInt(input[i]));
            }
        }

            for (ArrayList list : result) {
                for (Object n : list) {
                    System.out.printf("%d ", n );
                }
                System.out.println();

            }

        }
    }

