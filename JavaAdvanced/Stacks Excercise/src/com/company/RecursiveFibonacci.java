package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by nikijul on 01.02.2017.
 */
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        Deque<Long> queue=new ArrayDeque<>();


        for (int i = 0; i <=n ; i++) {
            if (i==0||i==1)
            {
                queue.add(1L);
            }
            else  {
                long number1=queue.poll();
                long number2=queue.peek();
                long number=number1+number2;
                queue.add(number);
            }
        }

        queue.poll();
        System.out.println(queue.poll());


    }
}