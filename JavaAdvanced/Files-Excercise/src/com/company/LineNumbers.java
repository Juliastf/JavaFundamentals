package com.company;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by nikijul on 02.02.2017.
 */
public class LineNumbers {

    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "/src/Input.txt";
        String outputPath = "/src/Output.txt";

        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + inputPath;
        String outputFilePath = projectPath + outputPath;
        File taskFile = new File(filePath);
        FileReader fileReader = new FileReader(taskFile);

        try (BufferedReader reader = new BufferedReader(fileReader);
             PrintWriter writer = new PrintWriter(outputFilePath)) {
            String line;
            int counter = 0;

            while ((line = reader.readLine()) != null) {
                counter++;
                writer.println(counter + ". " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


