package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by nikijul on 02.02.2017.
 */
public class GetFolderSize {
    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        String finalPath = projectPath + "/src/results.txt";

        Deque<File> queue = new ArrayDeque<>();
        File projectFolder = new File(projectPath);
        queue.add(projectFolder);
        int folderSize = 0;

        while (!queue.isEmpty()) {
            File currentFolder = queue.poll();

            if (currentFolder.isDirectory()) {
                File[] currentFiles = currentFolder.listFiles();
                for (File currentFile : currentFiles) {
                    if (!currentFile.isDirectory()) {
                        folderSize += currentFile.length();
                    } else {
                        queue.offer(currentFile);
                    }
                }
            } else {
                folderSize += currentFolder.length();
            }
        }

        try (PrintWriter writer = new PrintWriter(finalPath)) {
            writer.println("Folder size: " + folderSize);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
