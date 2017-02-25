package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 18.02.2017.
 */
public class NMS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();

        String input=scanner.nextLine();

        while(!input.equals("---NMS SEND---")){
                     sb.append(input);
            input=scanner.nextLine();
        }

        StringBuilder message=new StringBuilder();

        for (int i = 0; i <sb.length() ; i++) {
            if (i==0){
                message.append(sb.charAt(i));
            }
            else if (Character.toLowerCase(sb.charAt(i))>=Character.toLowerCase(sb.charAt(i-1))) {
                message.append(sb.charAt(i));
            }
            else    {
                message.append(" ");
                message.append(sb.charAt(i));
            }
        }
        String delimeter=scanner.nextLine();
        String[] mess=message.toString().split(" ");


        System.out.println(String.join(delimeter,mess));
    }
}
