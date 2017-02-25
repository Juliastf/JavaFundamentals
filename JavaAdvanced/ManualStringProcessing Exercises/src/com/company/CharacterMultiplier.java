package com.company;

import java.util.Scanner;

/**
 * Created by nikijul on 10.02.2017.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        String str1=input[0];
        String str2=input[1];

        int maxLength=Math.max(str1.length(), str2.length());
        int sum=0;

        for (int i = 0; i <maxLength ; i++) {
            if (str1.length()>i&&str2.length()>i){
                sum+=str1.charAt(i)*str2.charAt(i);
            }
            else if (i>=str1.length()){
                sum+=str2.charAt(i);
            }
            else if (i>=str2.length()){
                sum+=str1.charAt(i);
            }

        }

        System.out.println(sum);


    }
}
