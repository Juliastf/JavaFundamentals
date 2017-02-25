package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;

/**
 * Created by nikijul on 04.02.2017.
 */
public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashSet<String> regular=new HashSet<>();
        TreeSet<String> vip=new TreeSet<>();
        List<Character> digits=new ArrayList<Character>(Arrays.asList('1','2','3','4','5','6','7','8','9','0'));

        while (true){
            String input=scanner.nextLine();
            if (input.equals("PARTY")){
                break;
            }
            else if (digits.contains(input.charAt(0))){
                vip.add(input);
            }
            else{
                regular.add(input);
            }
        }

        while (true){
            String input=scanner.nextLine();
            if (input.equals("END")){
                break;
            }
            else if (vip.contains(input)){
                vip.remove(input);
            }
            else if(regular.contains(input)){
                regular.remove(input);
            }
        }

        vip.addAll(regular);

        System.out.println(vip.size());

        for (String person : vip) {
            System.out.println(person);

        }

    }
}
