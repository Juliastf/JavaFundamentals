package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by nikijul on 28.01.2017.
 */
public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='('){
                stack.push(i);
            }else if (input.charAt(i)==')'){
                int endPos=i;
                int startPos=stack.pop();
                System.out.println(input.substring(startPos,endPos+1));
            }
        }

        }
}
