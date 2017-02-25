package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nikijul on 16.02.2017.
 */
public class Solutions {
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
                .filter(student -> student.getGroup() == 2)
                .sorted((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()))
                .forEach(student -> System.out.println(student.getFirstName() + " " + student.getLastName()));

        students.stream()
                .filter(student -> student.getFirstName().compareTo(student.getLastName()) < 0)
                .forEach(student -> System.out.println(student.getFirstName() + " " + student.getLastName()));

        students.stream()
                .filter(student -> student.getAge()>=18&&student.getAge()<=24)
                .forEach(student -> System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getAge() ));

        Comparator<Student> sorted1=(s1, s2)->s1.getLastName().compareTo(s2.getLastName());

        Comparator<Student>sorted2=sorted1
                .thenComparing((s1,s2)->s2.getFirstName().compareTo(s1.getFirstName()));

        students.stream()
                .sorted(sorted2)
                .forEach(student -> System.out.println(student.getFirstName()+" "+student.getLastName()));

        students.stream()
                .filter(student -> student.getEmail().endsWith("@gmail.com"))
                .forEach(student -> System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getEmail()));

        students.stream()
                .filter(student -> student.getPhone().startsWith("02")||student.getPhone().startsWith("+3592"))
                .forEach(student -> System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getPhone()));

        students.stream()
                .filter(student -> student.getGrades().contains(6))
                .forEach(student -> {
                    System.out.print(student.getFirstName() + " " + student.getLastName() + " ");
                    student.getGrades().stream()
                            .sorted((g1, g2) -> g2.compareTo(g1))
                            .forEach(g1 -> System.out.print(g1+" "));

                    System.out.println();
                });
    }
}

