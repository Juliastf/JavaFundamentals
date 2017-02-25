package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by nikijul on 07.02.2017.
 */
public class ParseURLs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        String[] url = input.split("://");
        if (url.length != 2) {
            System.out.println("Invalid URL");
            return;
        }

        String protocol = url[0];
        int firstIndex = url[1].indexOf('/');
        String server = url[1].substring(0, firstIndex);
        String resource = url[1].substring(firstIndex + 1);

        System.out.println("Protocol = " + protocol);
        System.out.println("Server = " + server);
        System.out.println("Resources = " + resource);


    }
}
