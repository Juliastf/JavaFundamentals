package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by nikijul on 30.01.2017.
 */
public class SequenceWithQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startNumber = Long.parseLong(scanner.nextLine());
        Deque<Long> queue=new ArrayDeque<>();

        long s1=startNumber;
        long s2=s1+1;
        long s3=2*s1+1;
        queue.add(s1);
        queue.add(s2);
        queue.add(s3);

        for (int i = 0; i < 50; i++) {
            long firstNumber=queue.poll();
            long secondNumber=queue.peek();
            queue.add(firstNumber+2);
            queue.add(secondNumber+1);
            queue.add(2*secondNumber+1);
            System.out.print(firstNumber+" ");


        }

    }
}
