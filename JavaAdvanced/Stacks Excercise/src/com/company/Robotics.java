package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by nikijul on 30.01.2017.
 */
public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robots = scanner.nextLine().split(";");
        String[] time = scanner.nextLine().split(":");
        long hour = Integer.parseInt(time[0]) * 3600;
        long minutes = Integer.parseInt(time[1]) * 60;
        long seconds = Integer.parseInt(time[2]);
        long startTime=hour+minutes+seconds;

       String[] robotsNames = new String[robots.length];
        int[] robotsTimes =  new int[robots.length];
        int[] busyRobots =  new int[robots.length];

        for (int i = 0; i < robots.length; i++) {
            String[] robotsSpecs = robots[i].split("-");
            robotsNames[i]=robotsSpecs[0];
            robotsTimes[i]=Integer.valueOf(robotsSpecs[1]);


        }

        Deque<String> products=new ArrayDeque<>();
        String product=scanner.nextLine();
        while (!product.equals("End")) {

            products.add(product);
            product=scanner.nextLine();

        }

        int clock=0;

        while  (!products.isEmpty()) {
            clock++;
            boolean isProcessed=false;
            String productToProcess=products.poll();
            for (int j = 0; j < robots.length; j++) {
                if (busyRobots[j]>0){
                    busyRobots[j]--;}

            }
            for (int i = 0; i <robotsNames.length ; i++) {
                if (busyRobots[i]==0){
                    isProcessed=true;
                    busyRobots[i]=robotsTimes[i];
                    String timeStarted=getStartTime(startTime,clock);
                    System.out.printf("%s - %s [%s]%n", robotsNames[i], productToProcess, timeStarted);
                    break;
                }
            }
            if (!isProcessed){
                products.add(productToProcess);
            }
    }


}

    private static String getStartTime(long startTime, int clock) {

        long hours=((startTime+clock)/3600)%24;
        long minutes=((startTime+clock)/60)%60;
        long seconds=((startTime+clock)%60);

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);


    }
}
