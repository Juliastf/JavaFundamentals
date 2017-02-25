package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by nikijul on 01.02.2017.
 */
public class StackFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        Deque<Long> stack=new ArrayDeque<>();


        for (int i = 0; i <=n ; i++) {
            if (i==0||i==1)
            {
                stack.push(1L);
            }
            else  {
                long number1=stack.poll();
                long number2=stack.peek();
                long number=number1+number2;
                stack.push(number1);
                stack.push(number);
            }
        }


        System.out.println(stack.peek());


    }
    }

