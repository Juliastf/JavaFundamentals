package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by nikijul on 17.02.2017.
 */
public class SecondNature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> flowers = new ArrayDeque<>();
        ArrayDeque<Integer> buckets = new ArrayDeque<>();
        ArrayDeque<Integer> secondNature = new ArrayDeque<>();

        String[] flowersInput = scanner.nextLine().split(" ");
        for (String s : flowersInput) {
            flowers.add(Integer.parseInt(s));
        }

        String[] bucketInput = scanner.nextLine().split(" ");
        for (String s : bucketInput) {
            buckets.push(Integer.parseInt(s));
        }

        while (!flowers.isEmpty() && !buckets.isEmpty()) {
            int currentFlower = flowers.poll();
            int currentBucket = buckets.pop();
            if (currentFlower == currentBucket) {
                secondNature.add(currentFlower);

            } else if (currentBucket - currentFlower < 0) {
                int remainingFlower = currentFlower - currentBucket;
                flowers.addFirst(remainingFlower);


            } else if (currentBucket - currentFlower > 0) {
                int remainingWater = currentBucket - currentFlower;
                if (!buckets.isEmpty()) {
                    int nextBucket = buckets.pop();
                    buckets.push(nextBucket + remainingWater);
                } else {
                    buckets.push(remainingWater);
                }
            }

            if (flowers.isEmpty()) {
                while (!buckets.isEmpty())
                    System.out.print(buckets.pop() + " ");
            } else if (buckets.isEmpty()) {
                while (!flowers.isEmpty()) {
                    System.out.print(flowers.poll() + " ");
                }
            }
        }

        System.out.println();

        if (secondNature.isEmpty()) {
            System.out.println("None");
        }
        while (!secondNature.isEmpty()) {
            System.out.print(secondNature.poll() + " ");
        }

    }
}
