package com.company;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by nikijul on 04.02.2017.
 */
public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer numberOfStudents=Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double> listOfStudents=new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String name=scanner.nextLine();
            String[] scores=scanner.nextLine().split(" ");
            double sum=0;
            for (String score : scores) {
                sum+=Double.parseDouble(score);
            }
            double averageScore=sum/scores.length;
            listOfStudents.put(name, averageScore);
        }

        for (String s : listOfStudents.keySet()) {
            System.out.println(s+" is graduated with "+listOfStudents.get(s));

        }

    }
}

