package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by nikijul on 28.01.2017.
 */
public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        int n=Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue=new ArrayDeque<>();

        for (String child : input) {
            queue.add(child);
        }
        while (queue.size()>1){
            for (int i = 0; i < n ; i++) {
                if (i==n-1){
                    String childeRemoved=queue.remove();
                    System.out.println("Removed "+childeRemoved);
                }
                else{
                   String childPassed= queue.remove();
                    queue.add(childPassed);
                }
            }
        }
        System.out.println("Last is "+queue.remove());
    }
}
