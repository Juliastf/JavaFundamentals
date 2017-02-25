package com.company;

import java.util.*;

/**
 * Created by nikijul on 05.02.2017.
 */
public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> userLogs = new TreeMap<>();

        while (true) {
            String input = scanner.nextLine();
            if ("End".equals(input) || "end".equals(input)) {
                break;
            } else {
                String[] log = input.split(" ");
                String[] infoIp = log[0].split("=");
                String ip = infoIp[1];
                String[] user = log[2].split("=");
                String userName = user[1];

                if (!userLogs.containsKey(userName)) {
                    userLogs.put(userName, new LinkedHashMap<>());
                    userLogs.get(userName).put(ip, 1);
                } else {
                    if (!userLogs.get(userName).containsKey(ip)) {
                        userLogs.get(userName).put(ip, 1);
                    } else {
                        userLogs.get(userName).put(ip, userLogs.get(userName).get(ip) + 1);
                    }
                }
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> names : userLogs.entrySet()) {
            String user = names.getKey();
            int number = 1;
            System.out.println(user + ": ");
            for (Map.Entry<String, Integer> ipEntry : names.getValue().entrySet()) {
                String ip = ipEntry.getKey();
                int count = ipEntry.getValue();

                if (number < names.getValue().entrySet().size()) {
                    System.out.print(ip + " => " + count + ", ");
                    number++;
                } else {
                    System.out.print(ip + " => " + count + ".");
                }
            }
            System.out.println();

        }
    }
}
