package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by nikijul on 28.01.2017.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");

        ArrayDeque<String> stack=new ArrayDeque<>();
        for (int i = input.length-1; i >=0; i--) {
            stack.push(input[i]);
        }

        while   (stack.size()>1) {
            int number1=Integer.valueOf(stack.pop());
            String command=stack.pop();
            int number2=Integer.valueOf(stack.pop());
            int newNumber=0;

            if (command.equals("+")){
                newNumber=number1+number2;
            }
            else if (command.equals("-")){
                newNumber=number1-number2;
            }
            stack.push(String.valueOf(newNumber));
        }

        System.out.println(stack.pop());
    }
}
