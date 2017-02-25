package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nikijul on 02.02.2017.
 */
public class SerializArrayList {
    private static final String projectPath = System.getProperty("user.dir") + "/src/resources/";
    private static final String sFile = projectPath + "list.ser";

    public static void main(String[] args) {


        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 74.3, 2.25, 14.85, 80.5);

        try (FileOutputStream fos = new FileOutputStream(sFile)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(doubles);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(sFile)) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                List<Double> loadedDoubles = (List<Double>) ois.readObject();
                System.out.println(loadedDoubles.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
