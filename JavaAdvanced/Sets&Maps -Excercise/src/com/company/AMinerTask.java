package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by nikijul on 04.02.2017.
 */
public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int line=0;
        HashMap<String,Integer> resources=new HashMap<>();
        String resource="null";

        while   (true){
            line++;
            String input=scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            else    {
                if (line%2==1){
                    resource=input;
                }
                else {
                    if (!resources.containsKey(resource)){
                    resources.put(resource,Integer.parseInt(input));
                    }else  {
                        resources.put(resource,resources.get(resource)+Integer.parseInt(input));
                    }

                }

            }
        }

        for (String s : resources.keySet()) {
            System.out.println(s+" -> "+resources.get(s));
        }

    }
}
