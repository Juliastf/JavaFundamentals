package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by nikijul on 13.02.2017.
 */
public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,Integer> students=new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String[] input=scanner.nextLine().split(", ");
            students.put(input[0],Integer.parseInt(input[1]));
        }

        String condition=scanner.nextLine();
        Integer age=Integer.parseInt(scanner.nextLine());
        String format=scanner.nextLine();

        Predicate<Integer> tester = createTester(condition, age);

        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);

        printFilteredStudents(students, tester, printer);

    }

    private static void printFilteredStudents( LinkedHashMap<String, Integer> students,
                                               Predicate<Integer> tester,
                                               Consumer<Map.Entry<String, Integer>> printer) {

        for (Map.Entry<String, Integer> person : students.entrySet()) {
            if (tester.test(person.getValue())) {
                printer.accept(person);
            }
        }
    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter (String format) {
        switch (format) {
            case "name":
                return student -> System.out.printf("%s%n", student.getKey());
            case "age":
                return student -> System.out.printf("%d%n", student.getValue());
            case "name age":
                return student -> System.out.printf("%s - %d%n", student.getKey(), student.getValue());
            default:
                return null;
        }
    }

    private static Predicate<Integer> createTester (String condition, Integer age) {
        switch (condition) {
            case "younger":
                return x -> x <= age;
            case "older":
                return x -> x >= age;
            default:
                return null;
        }

    }
}
