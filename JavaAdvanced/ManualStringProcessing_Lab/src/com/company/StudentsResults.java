package com.company;

import java.nio.channels.Pipe;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by nikijul on 06.02.2017.
 */
public class StudentsResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, String> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" - ");
            students.put(input[0], input[1]);

        }

        if (n!=0){
        System.out.println(String.format("%-10s|%7s|%7s|%7s|%7s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));}
        for (String s : students.keySet()) {
            String[] gradesList = students.get(s).split(", ");
            double[] grades = new double[gradesList.length];
            double sum = 0;
            for (int i = 0; i < grades.length; i++) {
                grades[i] = Double.parseDouble(gradesList[i]);
                sum += grades[i];
            }
            double average = sum / 3;


            System.out.println(String.format("%-10s|%7.2f|%7.2f|%7.2f|%7.4f|", s, grades[0], grades[1], grades[2], average).replace(".", ","));


        }


    }
}
