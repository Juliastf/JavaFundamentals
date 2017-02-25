package com.company;

import java.io.*;

/**
 * Created by nikijul on 02.02.2017.
 */
public class SumLines {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "/src/resources/Input.txt";
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + path;

        File someFile = new File(filePath);

        FileReader fileReader = new FileReader(someFile);


        try (BufferedReader reader = new BufferedReader(fileReader)){
            String line;

            while ((line = reader.readLine()) != null) {
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
