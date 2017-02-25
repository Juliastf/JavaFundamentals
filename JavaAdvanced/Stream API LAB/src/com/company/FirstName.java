package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by nikijul on 14.02.2017.
 */
public class FirstName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] names=scanner.nextLine().split(" ");
        List<Character> letters= Arrays.asList(scanner.nextLine().split(" ")).stream().map(l->l.toUpperCase().charAt(0)).collect(Collectors.toList());

        Optional<String> finalName=Arrays.stream(names)
                .filter(n->letters.contains(n.charAt(0)))
                .sorted()
                .findFirst();
        if (finalName.isPresent()){
            System.out.println(finalName.get());
        }else {
            System.out.println("No match");
        }
    }
}
