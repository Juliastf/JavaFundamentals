package com.company;

import java.util.*;
import java.util.stream.DoubleStream;

/**
 * Created by nikijul on 14.02.2017.
 */
public class AverageOfDoubles {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> numbers= Arrays.asList(scanner.nextLine().split(" "));

        OptionalDouble result=numbers.stream()
                .filter(n->!n.isEmpty())
                .mapToDouble(n->Double.parseDouble(n))
                .average();

        if (result.isPresent()){
            System.out.printf("%.2f",result.getAsDouble());
        }else {
            System.out.println("No match");
        }

    }
}
