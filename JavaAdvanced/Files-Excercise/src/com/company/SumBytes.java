package com.company;

import java.io.*;

public class SumBytes {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/src/resources/Input.txt";
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + path;

        File taskFile = new File(filePath);
        FileReader fileReader = new FileReader(taskFile);

        try (BufferedReader reader = new BufferedReader(fileReader)) {
            long sum = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    sum += c;
                }
            }

            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
