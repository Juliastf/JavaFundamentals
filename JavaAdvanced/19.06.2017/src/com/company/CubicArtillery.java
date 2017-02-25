package com.company;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nikijul on 17.02.2017.
 */
public class CubicArtillery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int capacity=Integer.parseInt(scanner.nextLine());

        LinkedHashMap<Character,List<Integer>> bunkers=new LinkedHashMap<>();
        String input=scanner.nextLine();
        char currentBunker=' ';

        while (!input.equals("Bunker Revision"))
        {
            String[] tokens=input.split("\\s+");


            for (String token : tokens) {
                char firstSymbol=token.charAt(0);
                if (!Character.isDigit(firstSymbol)){
                    bunkers.put((token.charAt(0)), new ArrayList<>());
                    currentBunker=token.charAt(0);
                }


            }
         }

    }
}
