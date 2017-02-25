package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by nikijul on 28.01.2017.
 */
public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child : input) {
            queue.add(child);
        }
        int cycle=1;

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(cycle)){
                System.out.println("Prime "+queue.peek());
            }else {
                System.out.println("Removed "+queue.poll());
            }
                cycle++;
        }
        System.out.println("Last is " + queue.remove());
    }

    private static boolean isPrime(int cycle) {
        if (cycle<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(cycle); i++) {
            if (cycle%i==0){
               return false;

            }
        }
        return true;
    }
}