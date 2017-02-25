package com.company;

import java.io.*;

/**
 * Created by nikijul on 02.02.2017.
 */
public class ALLCAPITALS {
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

            while ((line = reader.readLine()) != null) {
                writer.println(line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
