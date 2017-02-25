package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Path studentsDataPath = Paths.get("C:\\Users\\nikijul\\Desktop\\SoftUni\\JavaAvnced\\Stream Api\\StudentData\\StudentData.txt");
        List<String> data = new ArrayList<>();
        try {
            data = Files.readAllLines(studentsDataPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> students = new ArrayList<>();

        for (int i = 1; i < data.size(); i++) {
            String[] tokens = data.get(i).split("\\s+");
            String facNum = tokens[0];
            String firstName = tokens[1];
            String lastName = tokens[2];
            String email = tokens[3];
            Integer age = Integer.parseInt(tokens[4]);
            Integer group = Integer.parseInt(tokens[5]);
            String phone = tokens[10];

            Student student = new Student(
                    facNum, firstName, lastName, email, age, group, phone);

            for (int j = 6; j <= 9; j++) {
                Integer grade = Integer.parseInt(tokens[j]);
                student.getGrades().add(grade);
            }
            students.add(student);

        }


        students.stream()
                .filter(student -> student.getGrades().stream().filter(g1 -> g1 >= 2 && g1 <= 3).count() > 2)
                .filter(s -> {
                    List<Integer> grades = s.getGrades().stream().filter(g -> g <= 3)
                            .collect(Collectors.toList());
                    return grades.size() >= 2;
                })
                .sorted((s1, s2) ->
                        Integer.compare(s1.getGrades().stream().mapToInt(x -> x).sum(),
                                s2.getGrades().stream().mapToInt(x -> x).sum()))
                .forEach(s -> {
                    System.out.print(s.getFirstName() + " " + s.getLastName() + " ");
                    s.getGrades().stream()
                            .sorted(Integer::compareTo) // (g1, g2) -> g1.compareTo(g2)
                            .forEach(g -> System.out.print(g + " "));
                    System.out.println();


                });


    }
}

