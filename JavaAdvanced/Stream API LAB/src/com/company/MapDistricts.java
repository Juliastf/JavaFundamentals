package com.company;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by nikijul on 15.02.2017.
 */
public class MapDistricts {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        int minPopulation = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> cityInfo = new LinkedHashMap<>();

        for (String name : names) {
            String[] tokens = name.split(":");
            cityInfo.putIfAbsent(tokens[0], new ArrayList<>());
            cityInfo.get(tokens[0]).add(Integer.parseInt(tokens[1]));
        }

        cityInfo.entrySet().stream()
                .filter(getLargerCities(minPopulation))
                .sorted(getSorting())
                .forEach(getPrinting());



    }

    private static Consumer<? super Map.Entry<String,List<Integer>>> getPrinting() {
        return c-> {
            System.out.print(c.getKey() + ": ");
            c.getValue().stream()
                    .sorted((kv2, kv1)->kv1.compareTo(kv2))
                    .limit(5)
                    .forEach(kv-> System.out.print(kv+" "));
            System.out.println();
        };
    }

    private static Comparator<? super Map.Entry<String, List<Integer>>> getSorting() {
        return (x1, x2) -> Integer.compare
                (x2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        (x1.getValue().stream().mapToInt(Integer::valueOf).sum()));
    }

    private static Predicate<? super Map.Entry<String, List<Integer>>> getLargerCities(int minPopulation) {
        return p -> p.getValue().stream()
                .mapToInt(Integer::valueOf)
                .sum() >= minPopulation;
    }


}
