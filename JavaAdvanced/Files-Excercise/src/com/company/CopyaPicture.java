package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by nikijul on 02.02.2017.
 */
public class CopyaPicture {
    private static final String PATH = System.getProperty("user.dir");
    public static void main(String[] args) throws IOException {
        String originalPicture = "/src/resources/gameAfTrons.png";
        String copyPicture = "/src/resources/copy-picture.jpg";
        FileInputStream inputStream = new FileInputStream(PATH + originalPicture);
        OutputStream outputStream = new FileOutputStream(PATH + copyPicture);

        int readBytes;
        byte[] bytesArr = new byte[512];

        while ((readBytes = inputStream.read(bytesArr)) != -1) {
            outputStream.write(readBytes);
        }

        inputStream.close();
        outputStream.close();
    }
}
