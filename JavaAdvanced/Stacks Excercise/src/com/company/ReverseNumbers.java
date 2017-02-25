package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by nikijul on 29.01.2017.
 */
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input= scanner.nextLine().split(" ");
        ArrayDeque<String> stack=new ArrayDeque<>();
        for (String s : input) {
            stack.push(s);
        }

        while (stack.size()>0){
            System.out.print(stack.pop()+" ");
        }
    }
}
