package com.company;

import java.io.*;

/**
 * Created by nikijul on 02.02.2017.
 */
public class MergeTwoFiles {
    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir") + "/src/resources/";
        String input1Path = projectPath + "Input1.txt";
        String input2Path = projectPath + "Input2.txt";
        String finalPath = projectPath + "results.txt";

        try (BufferedReader firstFileReader = new BufferedReader(new FileReader(input1Path));
             BufferedReader secondFileReader = new BufferedReader(new FileReader(input2Path));
             PrintWriter writer = new PrintWriter(new FileWriter(finalPath, true))) {

            String line = "";

            while ((line = firstFileReader.readLine()) != null) {
                writer.println(line);
            }
            while ((line = secondFileReader.readLine()) != null) {
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
